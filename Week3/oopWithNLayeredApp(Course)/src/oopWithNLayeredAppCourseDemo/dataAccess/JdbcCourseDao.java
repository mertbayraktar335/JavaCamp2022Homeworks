package oopWithNLayeredAppCourseDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppCourseDemo.entities.Course;

public class JdbcCourseDao implements CourseDao{

    List<Course> courses = new ArrayList<Course>();
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veri tabanına eklendi");
        
    }

    @Override
    public List<Course> getAll() {
        
        return courses;
    }
    
}
