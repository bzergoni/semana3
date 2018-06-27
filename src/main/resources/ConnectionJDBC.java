package com.globant.bootcamp.webapp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionJDBC{
	
	private static String db_ = "personas";
	private static String login_ = "postgres" ;
	private static String password_ = "postgres" ;
	private static String url_ = "jdbc:mysql://localhost/" + db_ ;
	private static Connection connection_;
	private static Statement st_ = null;

	public ConnectionJDBC(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection_ = DriverManager.getConnection(url_, login_, password_);
			if(connection_ != null){
				st_ = connection_.createStatement();
				System.out.println("Conexion a base de datos "+ db_ +"correcta." ) ;
			}
			else
				System.out.println("Conexion fallida.");
			} catch(SQLException e){e.printStackTrace();}
		catch(ClassNotFoundException e){e.printStackTrace();}
		catch(Exception e){e.printStackTrace();}
	}
}