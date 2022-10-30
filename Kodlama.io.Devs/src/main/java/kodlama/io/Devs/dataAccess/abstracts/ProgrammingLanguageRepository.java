package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

    List<ProgrammingLanguage> getAll();

    ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception;

    void delete(int id) throws Exception;

    ProgrammingLanguage getById(int id) throws Exception;

    void update(ProgrammingLanguage programmingLanguage,int id);

}
