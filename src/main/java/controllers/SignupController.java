package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import models.SignupModel;
public class SignupController {
	String dbUrl="jdbc:mysql://localhost:3306/u222487541_portal";
    String dbUname="root";
    String dbPassword="";
    String dbDriver="com.mysql.cj.jdbc.Driver";
    SignupModel srm=new SignupModel();
    public SignupController(SignupModel srm){
    	this.srm=srm;
    }
    public void toStore() {
        Connection con = null;
   		try{
   			Class.forName(dbDriver);  //class not found exception
 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
 			String sql = "insert into StudentTable (username,password,email,phone_no)"
 					+ "values('"+srm.getName()+"','"+srm.getPass()+"','"+srm.getEmail()+"','"+srm.getPhone()+"','"+srm.getRegister()+"','"+srm.getRoll()+"','"+srm.getCollege()+"','"+srm.getYear()+"')";
 			Statement s = con.createStatement();
 			s.execute(sql);
 		   	con.close();
		 }catch(Exception e){      
			e.printStackTrace();
		 }
    }
}
