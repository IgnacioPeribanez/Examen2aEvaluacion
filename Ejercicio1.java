package examen;

import java.util.ArrayList;

public class Ejercicio1 {
	
	public static int habilidadDisparo() {
		int disparo = (int) Math.floor(Math.random() * 10);
		return disparo;
	}
	
	public static int habilidadPorteria() {
		int porteria = (int) Math.floor(Math.random() * 10);
		return porteria;
	}
	
	public static void main(String[] args) {
		ArrayList<String> pla = informacionVideojuegos();
		for(int i = 0; i < pla.size(); i++) {
			System.out.println(pla.get(i));
		}
	}
}
