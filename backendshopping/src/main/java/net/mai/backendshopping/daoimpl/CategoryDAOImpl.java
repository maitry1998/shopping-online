/**
 * 
 */
package net.mai.backendshopping.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.mai.backendshopping.dao.CategoryDAO;
import net.mai.backendshopping.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	public static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		category.setId(1);
		category.setDescription("this is desc");
		category.setName("television");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setDescription("this is desc of 2");
		category.setName("mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setDescription("this is desc of 3");
		category.setName("laptop");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		
		
	}
	
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}



	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories)
		{
			if(category.getId() == id)
			{
				return category;
			}
		}
		
		return null;
	}

}
