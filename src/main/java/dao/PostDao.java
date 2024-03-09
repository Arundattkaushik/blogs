package dao;

import java.sql.*;
import java.util.ArrayList;

import entities.Categories;
import entities.Posts;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;


public class PostDao {
	
	private static Connection con;

	public PostDao(Connection con) {
		this.con = con;
	}
	
	public PostDao() {
		
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
	
	
	public Boolean savePost(Posts post) {
		Boolean pStatus = false;
		String q = "insert into posts (ptitle, pcontent, ppic, category, userId) value(?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, post.getPtitle());
			pstmt.setString(2, post.getpContent());
//			pstmt.setString(3, post.getPcode());
			pstmt.setString(3, post.getPpic());
			pstmt.setString(4, post.getCategory());
			pstmt.setString(5, post.getUserId());
			pstmt.executeUpdate();
			pStatus = true;
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pStatus;
	}

	
}
