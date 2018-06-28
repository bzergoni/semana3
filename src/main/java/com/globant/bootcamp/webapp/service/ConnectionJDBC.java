package com.globant.bootcamp.webapp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC{
	
	private static String db = "personas";
	private static String login = "postgres" ;
	private static String password = "postgres" ;
	private static String url = "jdbc:postgresql://localhost:5432/postgres/" + db ;
	private static Connection connection;

	public ConnectionJDBC(){
		try{
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, login, password);
			if(connection != null){
				System.out.println("Conexion a base de datos "+ db +" correcta." ) ;
			}
			else
				System.out.println("Conexion fallida.");
			} catch(SQLException e){e.printStackTrace();}
		catch(ClassNotFoundException e){e.printStackTrace();}
		catch(Exception e){e.printStackTrace();}
	}
	
	public Connection getConnection() {
		return connection;
	}
}