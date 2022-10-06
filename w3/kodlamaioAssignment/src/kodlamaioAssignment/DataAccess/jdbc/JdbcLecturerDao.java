package kodlamaioAssignment.DataAccess.jdbc;

import kodlamaioAssignment.DataAccess.LecturerDao;
import kodlamaioAssignment.Entities.Lecturer;

public class JdbcLecturerDao implements LecturerDao{

	@Override
	public void add(Lecturer lecturer) {
		System.out.println("Lecturer has been added : " + lecturer.getFirstName());
	}

	@Override
	public void delete(Lecturer lecturer) {
		System.out.println("Category has been added : " + lecturer.getFirstName());		
	}

	@Override
	public void update(Lecturer lecturer) {
		System.out.println("Category has been added : " + lecturer.getFirstName());		
	}

}
