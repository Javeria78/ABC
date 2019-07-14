package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Model2 {
	private String name;
    private String id;
    private String pwd;
    Connection con;
    
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}

public Model2()

{
	try {
		DriverManager.registerDriver(new OracleDriver());
		  con = DriverManager.getConnection("JDBC:oracle:thin:@//localhost:1521/XE",
	            "system", "system");
	}
	catch(SQLException e )
	{
		System.out.println("driver loading faied");
		e.printStackTrace();	
	}

}
public boolean register() 
{

	try {
	
	
	PreparedStatement pstmt = con.prepareStatement("Insert into mini values(?,?,?)");
	
	
	pstmt.setString(1,name);
	pstmt.setString(2,id);
	pstmt.setString(3,pwd);
	
	int rows=pstmt.executeUpdate();
	if(rows==0)
	return true;
	else
		return false;
	}
	 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return false;
}

public boolean login()
{
	
	try {

		PreparedStatement pstmt=con.prepareStatement("select * from mini where name=? and pwd=? ");
		pstmt.setString(1,name);
		pstmt.setString(2,pwd);
		ResultSet res=pstmt.executeQuery();
		while(res.next()==true)
		{
			return true;
		}
		return false; 
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false ; 
}
		


}
	



