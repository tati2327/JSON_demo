package com.tec.JSON;

import java.util.LinkedList;

// Clase ejecutable
public class main_json {

	public static void main(String[] args) {
		
		Molde paquete = new Molde();
		
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		paquete.setNombre("Kevin");
		//paquete.setlist(l1);
		paquete.setJugador(1);
		
		//paquete.setLinea("Linea");
		
		paquete.setScore1("11");
		
		paquete.setScore2("34");
		
		paquete.setTurno(1);
		
		String json =Transformador.convertJavaToJson(paquete);
		
		System.out.println(json);
		
		Molde a = Transformador.convertJsonToJava(json,Molde.class );
		System.out.println(a.getJugador());
		System.out.println(a.getNombre());
		System.out.println(a.getScore1());
		System.out.println(a.getScore2());
		System.out.println(a.getTurno());
	
		
	

	}

}
