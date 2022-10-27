package oopWithNLayeredAppCourseDemo;

import oopWithNLayeredAppCourseDemo.business.CategoryManager;
import oopWithNLayeredAppCourseDemo.business.CourseManager;
import oopWithNLayeredAppCourseDemo.business.InstructorManager;
import oopWithNLayeredAppCourseDemo.core.logging.DatabaseLogger;
import oopWithNLayeredAppCourseDemo.core.logging.FileLogger;
import oopWithNLayeredAppCourseDemo.core.logging.Logger;
import oopWithNLayeredAppCourseDemo.core.logging.MailLogger;
import oopWithNLayeredAppCourseDemo.dataAccess.HibernateCategoryDao;
import oopWithNLayeredAppCourseDemo.dataAccess.HibernateCourseDao;
import oopWithNLayeredAppCourseDemo.dataAccess.HibernateInstructorDao;
import oopWithNLayeredAppCourseDemo.entities.Category;
import oopWithNLayeredAppCourseDemo.entities.Course;
import oopWithNLayeredAppCourseDemo.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

        Category category1 = new Category(1, "Java");
        Category category2 = new Category(2, ".NET");

        System.out.println(" ");

        System.out.println("--KATEGORİLER--");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);

        categoryManager.add(category1);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        categoryManager.add(category2);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        Course course1 = new Course(1, "Java Kursu", 1, 1, 150);
        Course course2 = new Course(2, "Java Kursu", 1, 1, 250);

        System.out.println("--KURSLAR--");

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);

        courseManager.add(course1);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        courseManager.add(course2);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");

        System.out.println("--EĞİTMENLER--");

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor1);
    }
}
