package day3Homework3.kodlamaIo.src.dataAccess;

import day3Homework3.kodlamaIo.src.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Kategori Hibernate'e eklendi.");
		
	}

}
