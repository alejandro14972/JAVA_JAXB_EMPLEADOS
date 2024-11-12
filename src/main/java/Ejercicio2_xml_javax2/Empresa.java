package Ejercicio2_xml_javax2;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Empresa {

	private ArrayList<Departamento> departamentos;

	public Empresa() {
		super();
	}
	
	
	public Empresa(ArrayList<Departamento> departamentos) {
		super();
		this.departamentos = departamentos;
	}

	@XmlElementWrapper(name = "departamentos")
    @XmlElement(name = "departamento")
	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}


	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}


	@Override
	public String toString() {
		return "Empresa [departamentos=" + departamentos + "]";
	}
	
	
	
	

}
