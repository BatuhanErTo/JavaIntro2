package kodlamaioAssignment;

import java.util.ArrayList;
import java.util.List;

import kodlamaioAssignment.Business.Abstract.CategoryService;
import kodlamaioAssignment.Business.Abstract.CourseService;
import kodlamaioAssignment.Business.Concrete.CategoryManager;
import kodlamaioAssignment.Business.Concrete.CourseManager;
import kodlamaioAssignment.DataAccess.hibernate.HibernateCategoryDao;
import kodlamaioAssignment.DataAccess.hibernate.HibernateCourseDao;
import kodlamaioAssignment.Entities.Category;
import kodlamaioAssignment.Entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category1 = new Category(1, "C#");
		Category category2 = new Category(2, "JAVA");
		Category category3 = new Category(1, "C#");
		Category category4 = new Category(3, "GO");
		List<Category> categoryDb = new ArrayList<>();
		categoryDb.add(category1);
		categoryDb.add(category2);
		CategoryService categoryManager = new CategoryManager(new HibernateCategoryDao(), categoryDb);
		
		Course course1 = new Course(1,1,1,19.45,"C#","BEST QUALITY");
		Course course2 = new Course(2,1,1,19.45,"F#","BEST QUALITY");
		Course course3 = new Course(3,1,1,0,"JAVA","BEST QUALITY");
		Course course4 = new Course(4,1,1,2345,"GO","BEST QUALITY");
		List<Course> courseDb = new ArrayList<>();
		courseDb.add(course1);
		courseDb.add(course2);
		CourseService courseManager = new CourseManager(new HibernateCourseDao() , courseDb);
		courseManager.add(course3);
	}

}
