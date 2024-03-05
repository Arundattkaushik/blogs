package dao;

import java.sql.*;
import java.util.ArrayList;

import entities.Categories;

public class PostDao {
	private static Connection con;

	public PostDao(Connection con) {
		this.con = con;
	}
	
	public static ArrayList<Categories> getAllCategories(){
		ArrayList<Categories> list = new ArrayList<Categories>();
		try {
			
			String q = "select * from categories";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				
				int cid = Integer.valueOf(set.getString("cid"));
				String name = set.getString("name");
				String description = set.getString("description");
				list.add(new Categories(cid, name, description));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
