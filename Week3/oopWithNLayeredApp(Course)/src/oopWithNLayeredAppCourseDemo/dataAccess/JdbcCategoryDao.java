package oopWithNLayeredAppCourseDemo.dataAccess;

import oopWithNLayeredAppCourseDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {

        System.out.println("JDBC ile Eklendi : " + category.getName());

    }

}
