package it.polito.tdp.dizionario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ParolaDAO {
	private ArrayList<String> lista;
	
	
	public ParolaDAO() {
		lista = new ArrayList<String>();
	}


	public ArrayList<String> trovaParole(int lunghezza) {

		Connection conn = DBConnect.getConnection();

		String sql = "SELECT nome FROM parola WHERE CHAR_LENGTH(nome)= ? ORDER BY id";

		PreparedStatement st;
		try {
			st = conn.prepareStatement(sql);

			st.setInt(1, lunghezza);

			ResultSet res = st.executeQuery();
			res.beforeFirst();
			while(res.next()){
				lista.add(res.getNString("nome"));
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
		
		

	}
}
