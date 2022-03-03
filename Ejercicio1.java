package examen;

import java.util.ArrayList;

public class Ejercicio1 {

	/**
	 * pre: --- 
	 * Post: Este metodo genera un numero aleatorio para el atributo de
	 * disparo
	 */
	public static int habilidadDisparo() {
		int disparo = (int) Math.floor(Math.random() * 10);
		return disparo;
	}

	/**
	 * pre: --- 
	 * Post: Este metodo genera un numero aleatorio para el atributo de
	 * porteria
	 */
	public static int habilidadPorteria() {
		int porteria = (int) Math.floor(Math.random() * 10);
		return porteria;
	}

	/**
	 * pre: --- 
	 * Post: Este metodo genera un numero de jugadores y los devuelve en un
	 * Array
	 */
	public static ArrayList<Jugador> generadorJugadores(int N) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		for (int i = 0; i < N; i++) { // Creo 10 jugadores
			Jugador jugador = new Jugador("Jugador " + i, i + 1, habilidadDisparo(), habilidadPorteria());
			jugadores.add((int) Math.floor(Math.random() * jugadores.size()), jugador);
		}
		Jugador cheto = new Jugador("Cheto ", 20, 20, 20); // Creo 1 jugador con chetos para que siempre haya un ganador
		jugadores.add(cheto);
		return jugadores;
	}

	/**
	 * pre: --- 
	 * Post: Este metodo muestra como juegan los jugadores y les pone las
	 * condiciones necesarias
	 */
	public static void main(String[] args) {
		ArrayList<Jugador> base = generadorJugadores(10);
		for (int z = 0; z < base.size(); z++) {
			System.out.println(base.get(z));
		}
		System.out.println();
		System.out.println(base.get(0).getCalidadPorteria());
		System.out.println(base.get(1).getPotenciaDisparo());
		int ganador = 0;
		while (ganador == 0) { // Bucle hasta que solo quede un jugador
			System.out.println();
			if (base.get(0).getCalidadPorteria() < base.get(1).getPotenciaDisparo()) {
				base.get(0).setVidas(base.get(0).getVidas() - 1);
			}
			if (base.get(0).getVidas() <= 0) {
				base.remove(0);
			}
			base.add(base.size(), base.get(0));
			base.remove(0);
			if (base.size() - 1 == 0) {
				ganador = 1;
			}
			for (int z = 0; z < base.size(); z++) {
				System.out.println(base.get(z));
			}
		}
	}
}
