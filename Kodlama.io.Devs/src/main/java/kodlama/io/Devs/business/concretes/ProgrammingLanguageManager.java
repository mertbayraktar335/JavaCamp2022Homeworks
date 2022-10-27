package kodlama.io.Devs.business.concretes;

import java.util.List;

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

        return programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) throws Exception {
        programmingLanguageRepository.delete(id);

    }

    @Override
    public ProgrammingLanguage getById(int id) throws Exception {

        return programmingLanguageRepository.getById(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
         programmingLanguageRepository.update(programmingLanguage);
    }

    
}
