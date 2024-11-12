package Ejercicio2_xml_javax2;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"nombre", "listaEmpleados"})
public class Departamento {
	
	private String nombre;
	private ArrayList<Empleado> listaEmpleados;

	public Departamento() {
		super();
	}
	
	public Departamento(String nombre, ArrayList<Empleado> listaEmpleados) {
		super();
		this.nombre = nombre;
		this.listaEmpleados = listaEmpleados;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	@XmlAttribute
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", listaEmpleados=" + listaEmpleados + "]";
	}
	
	
	
	
}
