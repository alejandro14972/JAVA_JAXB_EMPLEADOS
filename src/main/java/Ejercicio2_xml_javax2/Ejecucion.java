package Ejercicio2_xml_javax2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado e1 = new Empleado("Alejandro", 001, "Programador", 1500);
		Empleado e2 = new Empleado("Juan", 002, "Análista", 2300);

		ArrayList<Empleado> empleadosDepInformatica = new ArrayList<Empleado>();

		empleadosDepInformatica.add(e1);
		empleadosDepInformatica.add(e2);

		Departamento deptInforma = new Departamento("Informatica", empleadosDepInformatica);

		Empleado e3 = new Empleado("Sergio", 003, "Gerente", 1500);
		Empleado e4 = new Empleado("Raul", 004, "Admionsitrativo", 1100);

		ArrayList<Empleado> empleadosDepRRHH = new ArrayList<Empleado>();

		empleadosDepRRHH.add(e3);
		empleadosDepRRHH.add(e4);

		Departamento deptRRHH = new Departamento("Recursos Humanos", empleadosDepRRHH);

		// CREAR UN ARRAYLIST PARA METER LOS DEPARTAMENTOS
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

		departamentos.add(deptRRHH);
		departamentos.add(deptInforma);

		// PASAR COMO PARAM EL ARRAYLIST DE DEPARTAMENTOS
		Empresa miEmpresa = new Empresa(departamentos);

		try {
			JAXBContext context = JAXBContext.newInstance(Empresa.class);
			Marshaller m = context.createMarshaller();

			//m.marshal(miEmpresa, System.out);
			m.marshal(miEmpresa, new File("MI_EMPRESA_3_JAXB.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		leerArchivoDeserializarXML();

	}

	private static void leerArchivoDeserializarXML() {
		ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();
		
		try {
			JAXBContext context = JAXBContext.newInstance(Empresa.class);
			Unmarshaller um = context.createUnmarshaller();
			
			try {
				Empresa miempresa = (Empresa)um.unmarshal(new FileReader(new File("MI_EMPRESA_3_JAXB.xml")));
				
				listaDepartamentos = miempresa.getDepartamentos();
				
				for (int i = 0; i < listaDepartamentos.size(); i++) {
					Departamento d = listaDepartamentos.get(i);
					System.out.println(d.toString());
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
