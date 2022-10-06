package kodlamaioAssignment.DataAccess.jdbc;

import kodlamaioAssignment.DataAccess.CourseDao;
import kodlamaioAssignment.Entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course has been added : " + course.getName());
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course has been added : " + course.getName());
	}

	@Override
	public void update(Course course) {
		System.out.println("Course has been added : " + course.getName());
	}

}
