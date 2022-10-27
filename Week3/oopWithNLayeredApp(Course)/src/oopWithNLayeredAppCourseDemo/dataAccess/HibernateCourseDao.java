package oopWithNLayeredAppCourseDemo.dataAccess;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppCourseDemo.entities.Course;

public class HibernateCourseDao implements CourseDao{

    List<Course> courses = new ArrayList<Course>();
    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("Hibernate ile veri tabanına eklendi : "+ course.getName());
        
    }

    @Override
    public List<Course> getAll() {
        
        return this.courses;
    }
    
}
