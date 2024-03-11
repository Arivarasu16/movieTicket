package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import models.LoginModel;

public class LoginController {
	String dbUrl="jdbc:mysql://localhost:3306/u222487541_portal";
    String dbUname="root";
    String dbPassword="";
    String dbDriver="com.mysql.cj.jdbc.Driver";
	LoginModel slm;
	public LoginController(LoginModel slm){
		this.slm=slm;
	}
	
	public boolean toGet() {
		 Connection con = null;
	   		try{
	   			Class.forName(dbDriver);  //class not found exception
	 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
	 			String sql = "select * from MovieTicket where username='"+slm.getName()+"' and password='"+slm.getPass()+"'";
	 			Statement s = con.createStatement();
	 			ResultSet rs=s.executeQuery(sql);
	 			if(rs.next()) {
	 				System.out.println(rs.getString(1)+"hello");
	 				return true;
	 			}
	 		   	con.close();
	 		   	return false;
			} catch(Exception e){      
				e.printStackTrace();
			}	
	   		return false;
	}
	
}
