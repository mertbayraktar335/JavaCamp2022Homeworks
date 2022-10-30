package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.config.PlaceholderConfigurerSupport;
import org.springframework.stereotype.Service;

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
        if (programmingLanguage.getName().isBlank()) {
            throw new Exception("İsim Boş Olamaz");
        }
        for (ProgrammingLanguage p : programmingLanguageRepository.getAll()) {
            
            if (p.getName().equalsIgnoreCase(programmingLanguage.getName())) {
                throw new Exception("İsim Tekrarlanamaz");
            }

        }
        return programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) throws Exception {
        
        ProgrammingLanguage pLanguageToDelete = getById(id);

            if (id == pLanguageToDelete.getId()) {
                programmingLanguageRepository.delete(pLanguageToDelete);
            }
            
        
        
    }

    @Override
    public ProgrammingLanguage getById(int id) throws Exception {
        for (ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getAll()) {
            if (id == programmingLanguage.getId()) {
                return programmingLanguage;

            }

        }
        return programmingLanguageRepository.getById(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, int id) {
        programmingLanguageRepository.update(programmingLanguage, id);
    }

}
