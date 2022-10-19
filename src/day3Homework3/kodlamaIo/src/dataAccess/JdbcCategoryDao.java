package day3Homework3.kodlamaIo.src.dataAccess;

import day3Homework3.kodlamaIo.src.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori Jdbc'ye eklendi.");
		
	}

}
