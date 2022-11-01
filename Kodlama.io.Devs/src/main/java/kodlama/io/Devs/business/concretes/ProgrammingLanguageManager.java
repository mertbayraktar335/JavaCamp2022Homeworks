package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.base.ParserMinimalBase;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {

        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (isIdExist(programmingLanguage.getId())) {
            throw new Exception("ID MEVCUT");
        }
        if (!isNameValid(programmingLanguage.getName())) {
            throw new Exception("İsim alanı boş veya sistemdeki isimle aynı");
        }

        return programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) throws Exception {

        ProgrammingLanguage pLanguageToDelete = getById(id);
        if (!isIdExist(pLanguageToDelete.getId())) {
            throw new Exception("ID MEVCUT DEĞİL");
        }
        programmingLanguageRepository.delete(pLanguageToDelete);

    }

    @Override
    public ProgrammingLanguage getById(int id) throws Exception {

        if (!isIdExist(id)) {
            throw new Exception("ID BULUNAMADI");
        }
        return programmingLanguageRepository.getById(id);

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) {
        programmingLanguageRepository.update(programmingLanguage, id);
    }

    private boolean isIdExist(int id) {
        for (ProgrammingLanguage pLanguage : getAll()) {
            if (pLanguage.getId() == id) {
                return true;
            }

        }
        return false;
    }

    private boolean isNameValid(String name) throws Exception {
        if (name.isBlank()) {
            return false;
        }
        for (ProgrammingLanguage p : programmingLanguageRepository.getAll()) {

            if (name.equalsIgnoreCase(p.getName())) {

                return false;

            }

        }
        return true;
    }

}
