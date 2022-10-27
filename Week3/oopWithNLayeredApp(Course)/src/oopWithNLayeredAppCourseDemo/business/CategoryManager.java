package oopWithNLayeredAppCourseDemo.business;





import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppCourseDemo.core.logging.Logger;
import oopWithNLayeredAppCourseDemo.dataAccess.CategoryDao;
import oopWithNLayeredAppCourseDemo.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories = new ArrayList<Category>();
    


    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

        public void add(Category category) throws Exception{
        for (Category c : categories) {
            if(c.getName().equals(category.getName())){
                throw new Exception("Kategori ismi tekrarlanamaz");
            }
           
        }
        categoryDao.add(category);
        categories.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getName());
        }
    }
}
