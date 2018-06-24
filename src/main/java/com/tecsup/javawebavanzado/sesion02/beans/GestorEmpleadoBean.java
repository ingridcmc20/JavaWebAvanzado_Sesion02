package com.tecsup.javawebavanzado.sesion02.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.tecsup.javawebavanzado.sesion02.model.Empleado;

@ManagedBean(name = "gestorEmpleadoBean")
@SessionScoped
public class GestorEmpleadoBean {
	private List<Empleado> list;
	
	@PostConstruct
	public void init() {
		list = new ArrayList<Empleado>();
		list.add(new Empleado(new Long(1), "Seiya"));
		list.add(new Empleado(new Long(2), "Shun"));
		list.add(new Empleado(new Long(3), "Hyoga"));
		list.add(new Empleado(new Long(4), "Shiryu"));
		list.add(new Empleado(new Long(5), "Ikki"));
	}

	public List<Empleado> getList() {
		return list;
	}

	public void setList(List<Empleado> list) {
		this.list = list;
	}
}
