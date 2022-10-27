package oopWithNLayeredAppCourseDemo.dataAccess;

import oopWithNLayeredAppCourseDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile eklendi : " + instructor.getFirstName()+ " "+instructor.getLastName());
        
    }
    
}
