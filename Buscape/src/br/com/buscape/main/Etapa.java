package br.com.buscape.main;

public class Etapa {

	private String etapa;
	private String stco;
	private String dscr;
	
	public Etapa(String nome){
		this.dscr = nome;
	}
	
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public String getStco() {
		return stco;
	}
	public void setStco(String stco) {
		this.stco = stco;
	}
	public String getDscr() {
		return dscr;
	}
	public void setDscr(String dscr) {
		this.dscr = dscr;
	}
	@Override
	public String toString(){
		return dscr;
	}
}
