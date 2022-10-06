package kodlamaioAssignment.Business.Concrete;

import java.util.List;

import kodlamaioAssignment.Business.Abstract.CategoryService;
import kodlamaioAssignment.DataAccess.CategoryDao;
import kodlamaioAssignment.Entities.Category;



public class CategoryManager implements CategoryService{
	CategoryDao categoryDao;
	List<Category> categories;
	public CategoryManager(	CategoryDao categoryDao,List<Category> categories) {
		this.categoryDao = categoryDao;
		this.categories = categories;
	}
	
	@Override
	public void add(Category category) throws Exception{
		for(Category ctgry : categories) {
			if(ctgry.getName().equals(category.getName())) {
				throw new Exception("Category's name could not be same as others'");
			}
		}
		categoryDao.add(category);
		categories.add(category);
	}
	
}
