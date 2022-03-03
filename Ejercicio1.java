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
			jugadores.add((int) Math.floor(Math.random() * jugadores.size()) , jugador);
		}
		jugadores.add(20,20);
		return jugadores;
	}
	
	public static void main(String[] args) {
		ArrayList<Jugador> base = generadorJugadores(10);
		ArrayList<Jugador> escribir = new ArrayList<Jugador>();
	
		System.out.println();
		System.out.println(base.get(0).getCalidadPorteria());
		System.out.println(base.get(1).getPotenciaDisparo());
		int ganador = 0;
		while (ganador == 0) {
			for(int z = 0; z < base.size(); z++) {
				System.out.println(base.get(z));
			}
			System.out.println();
			if(base.get(0).getCalidadPorteria() < base.get(1).getPotenciaDisparo()) {
				base.get(0).setVidas(base.get(0).getVidas()-1);
				base.add(base.size(), base.get(0));
				base.remove(0);
			}else {
				base.add(base.size(), base.get(0));
				base.remove(0);
			}
			if (base.get(0).getVidas() < 0) {
				base.remove(0);
			}
			if (base.size()-1 == 0) {
				ganador = 1;
			}
		}
	}
}
