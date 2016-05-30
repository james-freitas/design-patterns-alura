package com.alura.designpatterns.modulo2fazer.capitulo1.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

	public static void main(String[] args) throws SQLException {
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
		
		PreparedStatement ps = c.prepareStatement("select * from table");
		
		// criar classe cuja responsabilidade � criar uma Connection
		
	}
	
}
