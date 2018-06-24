package com.tecsup.javawebavanzado.sesion02.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "eventoBean")
@RequestScoped
public class EventoBean {
	private String codigoEmpleado;
	private String[] horariosDisponibles;
	private String transporte;
	private String comentarios;
	private String recibirInfo;

	public void registrar() {
		System.out.println("transporte: " + transporte);
		System.out.println("recibirInfo: " + recibirInfo);
		System.out.println("Total Horarios: " + horariosDisponibles.length);
	}
	
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String[] getHorariosDisponibles() {
		return horariosDisponibles;
	}

	public void setHorariosDisponibles(String[] horariosDisponibles) {
		this.horariosDisponibles = horariosDisponibles;
	}

	public String getTransporte() {
		return transporte;
	}

	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getRecibirInfo() {
		return recibirInfo;
	}

	public void setRecibirInfo(String recibirInfo) {
		this.recibirInfo = recibirInfo;
	}
}
