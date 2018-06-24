package com.tecsup.javawebavanzado.sesion02.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "noticiaBean")
@RequestScoped
public class NoticiaBean {
	private String titulo;
	private int dias;
	private String contenido;

	public void enviar() {
		System.out.println("titulo: " + titulo);
		System.out.println("dias: " + dias);
		System.out.println("contenido: " + contenido);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
}
