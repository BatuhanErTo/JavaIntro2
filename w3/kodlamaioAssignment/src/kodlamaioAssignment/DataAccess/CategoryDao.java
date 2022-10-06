package kodlamaioAssignment.DataAccess;

import kodlamaioAssignment.Entities.Category;

public interface CategoryDao {
	void add(Category category);
	void delete(Category category);
	void update(Category category);
}
