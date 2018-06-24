package com.tecsup.javawebavanzado.sesion02.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "booleanoBean")
@SessionScoped
public class BooleanoBean {
	public boolean opeA;
	public boolean opeB;
	public String operacion;
	public boolean total;

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public boolean getTotal() {
		return total;
	}

	public void setTotal(boolean total) {
		this.total = total;
	}

	public String calcular() {
		if ("and".equals(operacion)) {
			total = opeA && opeB;
		} else if ("or".equals(operacion)) {
			total = opeA || opeB;
		} else {
			total = opeA ^ opeB;
		}
		return "booleanos";
	}

	public boolean getOpeA() {
		return opeA;
	}

	public void setOpeA(boolean opeA) {
		this.opeA = opeA;
	}

	public boolean getOpeB() {
		return opeB;
	}

	public void setOpeB(boolean opeB) {
		this.opeB = opeB;
	}

}
