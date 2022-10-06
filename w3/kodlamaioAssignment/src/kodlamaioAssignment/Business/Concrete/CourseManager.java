package kodlamaioAssignment.Business.Concrete;

import java.util.List;

import kodlamaioAssignment.Business.Abstract.CourseService;
import kodlamaioAssignment.DataAccess.CourseDao;
import kodlamaioAssignment.Entities.Course;

public class CourseManager implements CourseService{
	CourseDao courseDao;
	List<Course> courses;
	public CourseManager(CourseDao courseDao,List<Course> courses) {
		this.courseDao = courseDao;
		this.courses = courses;
	}
	
	@Override
	public void add(Course course) throws Exception{
		if(course.getPrice() <= 0) {
			throw new Exception("Course's price must be greater than 0");
		}
		for(Course crs : courses) {
			if(crs.getName().equals(course.getName())) {
				throw new Exception("Course's name could not be same as others'");
			}
		}
		courseDao.add(course);
		courses.add(course);
	}

}
