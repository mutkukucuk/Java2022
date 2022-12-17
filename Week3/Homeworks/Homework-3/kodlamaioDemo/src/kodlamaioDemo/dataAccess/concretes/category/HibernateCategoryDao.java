package kodlamaioDemo.dataAccess.concretes.category;



import kodlamaioDemo.dataAccess.abstracts.CategoryDao;
import kodlamaioDemo.entities.concretes.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile " + category.getCategoryName() + " veri tabanina eklendi");		
	}



}
