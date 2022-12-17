package kodlamaioDemo.business.concretes;

import java.util.ArrayList; 
import java.util.List; 

import kodlamaioDemo.business.abstracts.CategoryService;
import kodlamaioDemo.core.abstracts.Logger;
import kodlamaioDemo.dataAccess.abstracts.CategoryDao;
import kodlamaioDemo.entities.concretes.Category;

public class CategoryManager implements CategoryService{

	private CategoryDao categoryDao;
	private List<Logger> loggers;
	private List<Category> categories = new ArrayList<>();
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	@Override
	public void add(Category category){
		boolean status = true;
		for (Category kategori : categories) {
			if (kategori.getCategoryName().equals(category.getCategoryName())) {
				status = false;
				break;
			}
		}
		if (!status) {
			System.out.println("This category already exists");
		}
		
		else {
			categories.add(category);
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
		}
	}


	
	
}
