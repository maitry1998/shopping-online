package net.mai.backendshopping.dao;

import java.util.List;

import net.mai.backendshopping.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
