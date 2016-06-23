package it.polito.tdp.dizionario.model;

import java.util.ArrayList;

import it.polito.tdp.dizionario.dao.ParolaDAO;

public class DizionarioModel {
	private int id;
	private String nome;
	private int lunghezza;
	private ArrayList<String> dizionario;
	private ParolaDAO dao;
	
	public DizionarioModel() {
		this.id = 0;
		this.nome = null;
		lunghezza = 0;
		dizionario = new ArrayList <String>();
		dao = new ParolaDAO();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<String> trovaDizionario(int lunghezza){
		dizionario = ParolaDAO.trovaParole(lunghezza);
		return dizionario;
	}
	
	
	
	
}
