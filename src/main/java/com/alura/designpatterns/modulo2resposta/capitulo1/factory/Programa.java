package com.alura.designpatterns.modulo2resposta.capitulo1.factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {

	public static void main(String[] args) throws SQLException {
		Connection c = new ConnectionFactory().getConnection();		
		PreparedStatement ps = c.prepareStatement("select * from table");
	}
	
}
