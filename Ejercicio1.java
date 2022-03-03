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
	
	public static ArrayList<Jugador> generadorJugadores(int N) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		for (int i = 0; i < N; i++) {
			Jugador jugador = new Jugador("Jugador " + i, i + 1, habilidadDisparo(), habilidadPorteria());
			jugadores.add((int) Math.floor(Math.random() * 2) , jugador);
		}
		return jugadores;
	}
	
	public static void main(String[] args) {
		ArrayList<Jugador> base = generadorJugadores(10);
		ArrayList<Jugador> escribir = new ArrayList<Jugador>();
		for(int i = 0; i < base.size(); i++) {
			System.out.println(base.get(i));
		}
			if(base.get(0).getCalidadPorteria() < base.get(1).getPotenciaDisparo()) {
				base.get(0).setVidas(base.get(0).getVidas()-1);
			}
	}
}
