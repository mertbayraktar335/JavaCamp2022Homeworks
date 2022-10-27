package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> pLanguages;

    public InMemoryProgrammingLanguageRepository() {

        pLanguages = new ArrayList<ProgrammingLanguage>();
        pLanguages.add(new ProgrammingLanguage(1, "Java"));
        pLanguages.add(new ProgrammingLanguage(2, ".NET"));

    }

    @Override
    public List<ProgrammingLanguage> getAll() {

        return pLanguages;
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception {
        for (ProgrammingLanguage p : pLanguages) {
            if (programmingLanguage.getName().isBlank()) {
                throw new Exception("İsim Boş Olamaz");
            }
            if (p.getName().equalsIgnoreCase(programmingLanguage.getName())) {
                throw new Exception("İsim Tekrarlanamaz");
            }

        }
        pLanguages.add(programmingLanguage);
        return programmingLanguage;
    }

    @Override
    public void delete(int id) throws Exception {
        for (ProgrammingLanguage programmingLanguage : pLanguages) {
            if (id == programmingLanguage.getId()) {
                pLanguages.remove(programmingLanguage);
            }

        }

    }

    @Override
    public ProgrammingLanguage getById(int id)throws Exception {

        for (ProgrammingLanguage programmingLanguage : pLanguages) {
            if (id == programmingLanguage.getId()) {
                return programmingLanguage;

            }

        }
        return null;
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        int index = 0;
		for (int i = 0; i < pLanguages.size(); i++) {
			if (pLanguages.get(i).getId() == programmingLanguage.getId()) {
				index = i;
			}
		}
		pLanguages.set(index, programmingLanguage);
    }

        
        
    

}
