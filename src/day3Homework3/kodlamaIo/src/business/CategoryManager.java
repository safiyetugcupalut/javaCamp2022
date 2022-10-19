package day3Homework3.kodlamaIo.src.business;


import java.util.List;

import day3Homework3.kodlamaIo.src.dataAccess.CategoryDao;
import day3Homework3.kodlamaIo.src.entities.Category;
import day3Homework3.kodlamaIo.src.logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	public static List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers,List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		CategoryManager.categories = categories;
	}
	
	public void add(Category category) throws Exception {

		for (Category categry : categories) {
			if (categry.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori adi digerleriyle ayni olamaz !");

			}

		}
		categoryDao.add(category);
		categories.add(category);
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
	
}
