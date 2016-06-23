package it.polito.tdp.dizionario.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBConnect {
	
	private static final String jdbcURL = "jdbc:mysql://localhost/nomedb?user=root&password=root" ;
	// se accedo direttamente a heidy devo mettere password = root, altrimenti non la preciso
	
	private static ComboPooledDataSource dataSource = null ;
	
	public static Connection getConnection() {
		Connection conn;
		try {
			//se uso connctions pooling
			  	if(dataSource==null) {
				// creare ed attivare il Connection Pool
				dataSource = new ComboPooledDataSource() ;
				dataSource.setJdbcUrl(jdbcURL);
			}
			
			return dataSource.getConnection();
			 
			//conn = DriverManager.getConnection(jdbcURL);
			//return conn ;
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore nella connessione", e) ;
		}
	}
}