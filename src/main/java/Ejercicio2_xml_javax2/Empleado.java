package Ejercicio2_xml_javax2;

import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"nombre", "id", "puesto", "salario"})
public class Empleado {
	
	private String nombre;
	private int id;
	private String puesto;
	private double salario;
	
	
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nombre, int id, String puesto, double salario) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", id=" + id + ", puesto=" + puesto + ", salario=" + salario + "]";
	}
	
	
	
	
	
	

}
