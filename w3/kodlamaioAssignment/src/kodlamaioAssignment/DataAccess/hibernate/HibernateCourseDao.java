package kodlamaioAssignment.DataAccess.hibernate;

import kodlamaioAssignment.DataAccess.CourseDao;
import kodlamaioAssignment.Entities.Course;

public class HibernateCourseDao implements CourseDao{
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
