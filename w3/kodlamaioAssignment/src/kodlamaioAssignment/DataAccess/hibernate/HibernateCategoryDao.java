package kodlamaioAssignment.DataAccess.hibernate;

import kodlamaioAssignment.DataAccess.CategoryDao;
import kodlamaioAssignment.Entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	
	@Override
	public void add(Category category) {
		System.out.println("Category has been added : " + category.getName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category has been deleted : " + category.getName());
	}

	@Override
	public void update(Category category) {
		System.out.println("Category has been updated : " + category.getName());
	}
	
}
