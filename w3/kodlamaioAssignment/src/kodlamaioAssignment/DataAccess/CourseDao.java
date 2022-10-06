package kodlamaioAssignment.DataAccess;

import kodlamaioAssignment.Entities.Course;

public interface CourseDao {
	void add(Course course);
	void delete(Course course);
	void update(Course course);
}
