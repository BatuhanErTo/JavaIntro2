package kodlamaioAssignment.DataAccess;

import kodlamaioAssignment.Entities.Lecturer;

public interface LecturerDao {
	void add(Lecturer lecturer);
	void delete(Lecturer lecturer);
	void update(Lecturer lecturer);
}
