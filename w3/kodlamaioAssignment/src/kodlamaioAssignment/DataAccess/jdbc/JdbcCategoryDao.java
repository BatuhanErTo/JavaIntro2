package kodlamaioAssignment.DataAccess.jdbc;

import kodlamaioAssignment.Entities.Category;

import kodlamaioAssignment.DataAccess.CategoryDao;

public class JdbcCategoryDao implements CategoryDao{
	
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
