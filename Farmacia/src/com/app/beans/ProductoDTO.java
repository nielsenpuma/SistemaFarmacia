package com.app.beans;

public class ProductoDTO {
	private String cod_pro;
	private String desc_pro;
	private double pre_pro;
	private int stk_act;
	private int stk_min;
	private String unid_med;
	private String fec_ven;
	private LaboratorioDTO cod_lab;
	private CategoriaDTO cod_cat;

	public String getCod_pro() {
		return cod_pro;
	}

	public void setCod_pro(String cod_pro) {
		this.cod_pro = cod_pro;
	}

	public String getDesc_pro() {
		return desc_pro;
	}

	public void setDesc_pro(String desc_pro) {
		this.desc_pro = desc_pro;
	}

	public double getPre_pro() {
		return pre_pro;
	}

	public void setPre_pro(double pre_pro) {
		this.pre_pro = pre_pro;
	}

	public int getStk_act() {
		return stk_act;
	}

	public void setStk_act(int stk_act) {
		this.stk_act = stk_act;
	}

	public int getStk_min() {
		return stk_min;
	}

	public void setStk_min(int stk_min) {
		this.stk_min = stk_min;
	}

	public String getUnid_med() {
		return unid_med;
	}

	public void setUnid_med(String unid_med) {
		this.unid_med = unid_med;
	}

	public String getFec_ven() {
		return fec_ven;
	}

	public void setFec_ven(String fec_ven) {
		this.fec_ven = fec_ven;
	}

	public LaboratorioDTO getCod_lab() {
		return cod_lab;
	}

	public void setCod_lab(LaboratorioDTO cod_lab) {
		this.cod_lab = cod_lab;
	}

	public CategoriaDTO getCod_cat() {
		return cod_cat;
	}

	public void setCod_cat(CategoriaDTO cod_cat) {
		this.cod_cat = cod_cat;
	}
}
