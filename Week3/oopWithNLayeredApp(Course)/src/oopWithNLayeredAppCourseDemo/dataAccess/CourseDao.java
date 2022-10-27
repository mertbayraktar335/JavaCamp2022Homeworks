package oopWithNLayeredAppCourseDemo.dataAccess;

import java.util.List;

import oopWithNLayeredAppCourseDemo.entities.Course;

public interface CourseDao {
    void add(Course course);
    List<Course> getAll();
}
