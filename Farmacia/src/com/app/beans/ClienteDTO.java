package com.app.beans;

public class ClienteDTO {
	private String cod_cli;
	private String nom_cli;
	private String apat_cli;
	private String amat_cli;
	private String fec_reg_cli;
	private int puntos;

	public String getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}

	public String getNom_cli() {
		return nom_cli;
	}

	public void setNom_cli(String nom_cli) {
		this.nom_cli = nom_cli;
	}

	public String getApat_cli() {
		return apat_cli;
	}

	public void setApat_cli(String apat_cli) {
		this.apat_cli = apat_cli;
	}

	public String getAmat_cli() {
		return amat_cli;
	}

	public void setAmat_cli(String amat_cli) {
		this.amat_cli = amat_cli;
	}

	public String getFec_reg_cli() {
		return fec_reg_cli;
	}

	public void setFec_reg_cli(String fec_reg_cli) {
		this.fec_reg_cli = fec_reg_cli;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
