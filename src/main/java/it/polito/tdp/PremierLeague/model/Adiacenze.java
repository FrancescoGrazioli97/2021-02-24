package it.polito.tdp.PremierLeague.model;

public class Adiacenze {

	Player p1;
	Player p2;
	Double peso;
	
	
	public Adiacenze(Player p1, Player p2, Double peso) {
		this.p1 = p1;
		this.p2 = p2;
		this.peso = peso;
	}


	public Player getP1() {
		return p1;
	}


	public void setP1(Player p1) {
		this.p1 = p1;
	}


	public Player getP2() {
		return p2;
	}


	public void setP2(Player p2) {
		this.p2 = p2;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
	
}