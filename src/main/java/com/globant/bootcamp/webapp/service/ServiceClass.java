package com.globant.bootcamp.webapp.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceClass{
	
	public static void main(String[] args) {
		
		ConnectionJDBC connection = new ConnectionJDBC();
		Connection con = connection.getConnection();
		
		Statement st;
		ResultSet rs;
		String sql1 = "select * from personas.Persona";
		{ //Ver por que me pide otra llave
		try {
			st = con.createStatement(); //conexion entre BD y app java
			rs = st.executeQuery(sql1);
			
			while(rs.next()){
				System.out.println("DNI: "+rs.getString(1));
				System.out.println("Nombre: "+rs.getString(2));
				System.out.println("Apellido: "+rs.getString(3));
				System.out.println("----------------------");
			}
			
			con.close();
			rs.close();
			st.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}}
	}
}