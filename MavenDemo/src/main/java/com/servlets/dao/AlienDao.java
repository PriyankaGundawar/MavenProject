package com.servlets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.servlets.model.Alien;

public class AlienDao {
	
	String url= "jdbc:mysql://localhost:3306/priyadb";
	String username ="root";
	String password = "root";
	
	public Alien getAlien(int aid) {
		Alien a= new Alien();
//		a.setAid(11);
//		a.setAname("Pilli");
//		a.setTech("Java");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			java.sql.Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid="+aid);
			if(rs.next()) {
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}

}
