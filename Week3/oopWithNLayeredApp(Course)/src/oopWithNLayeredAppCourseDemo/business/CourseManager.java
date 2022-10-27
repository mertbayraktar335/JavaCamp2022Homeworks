package oopWithNLayeredAppCourseDemo.business;

import oopWithNLayeredAppCourseDemo.core.logging.Logger;
import oopWithNLayeredAppCourseDemo.dataAccess.CourseDao;
import oopWithNLayeredAppCourseDemo.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;

    }

    public void add(Course course) throws Exception {

        for (Course courses : courseDao.getAll()) {
            if (courses.getName().equalsIgnoreCase(course.getName()) ) {
                throw new Exception("Kurs Adı Tekrarlanamaz");
            }
            if (course.getPrice() < 0) {
                throw new Exception("Kurs ücreti 0 dan küçük olamaz.");
            }

        }
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getName());
        }
    }
}
