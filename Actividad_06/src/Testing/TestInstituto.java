package Testing;



import java.util.ArrayList;

import modelo.dao.InstitutoDaoImplList;
import modelo.javabeans.Administrativo;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;
import modelo.javabeans.Alumno;

public class TestInstituto {

	public static void main(String[] args) {
		
		InstitutoDaoImplList instituto = new InstitutoDaoImplList();
		
		
		
		System.out.println("------------------------------");
	System.out.println("usamos el metodo buscarTodas");	
	System.out.println("------------------------------");
	for(Persona ele: instituto.buscarTodas()) {
		System.out.println(ele);
	}
	System.out.println("------------------------------");
		
	System.out.println("usamos el metodo altaPersona");	
	System.out.println("------------------------------");
	Persona prof2 = new Profesor("42569871", "Teresa", "c/ juan carlos nº3", "624897520", "BBDD");
	instituto.altaPersona(prof2);
	for(Persona ele: instituto.buscarTodas()) {
		System.out.println(ele);
	}
	System.out.println("------------------------------");
	
	
	System.out.println("usamos el metodo eliminarPersona");	
	System.out.println("------------------------------");
	instituto.eliminarPersona(prof2);
	for(Persona ele: instituto.buscarTodas()) {
		System.out.println(ele);
	}
	System.out.println("------------------------------");

	
	
	System.out.println("usamos el metodo buscarPersona para encontrar Diego:");	
	System.out.println("------------------------------");
	System.out.println(instituto.buscarPersona("05728723L"));

	
	System.out.println("------------------------------");
	
	
	System.out.println("usamos el metodo buscarPersona para comprobar que sale nulo");	
	System.out.println("------------------------------");
	System.out.println(instituto.buscarPersona("78236985F"));

	
	System.out.println("------------------------------");
	
	System.out.println("usamos el metodo buscarPersonaPorTipo: Profesor");	
	System.out.println("------------------------------");
	instituto.buscarPersonaPorTipo("Profesor");
	
	
System.out.println("------------------------------");
	
	System.out.println("usamos el metodo buscarPersonaPorTipo: Alumno");	
	System.out.println("------------------------------");
	instituto.buscarPersonaPorTipo("Alumno");
	
	
System.out.println("------------------------------");
	
	System.out.println("usamos el metodo buscarPersonaPorTipo: Administrativo");
	System.out.println("------------------------------");
	instituto.buscarPersonaPorTipo("Administrativo");
}
	
}
