package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {

	/**
	 * pre: --- 
	 * Post: Este metodo lee el fichero y compara la longitud de las
	 * palabras
	 */
	public static int palabrasMasLargasQue(int longitud) {
		int contador = 0;
		File file = new File("C:\\Users\\Salesianos\\Downloads\\textoExamen.txt");
		try {
			Scanner f = new Scanner(file);
			System.out.println();
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				linea = linea.replaceAll(",", " ").replaceAll("\\.", " ").replaceAll(":", " ").replaceAll("\"", " ");
				String[] lineacompleta = linea.split(" ");
				for (int i = 0; i < lineacompleta.length; i++) {
					if (lineacompleta[i].length() > longitud) {
						System.out.println(lineacompleta[i]);
						contador++;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return contador;
	}

	/**
	 * pre: --- 
	 * Post: Este metodo llama al palabrasMasLargasQue() y le manda la
	 * longitud a limitar
	 */
	public static void main(String[] args) {
		int longitud = 5;
		System.out.println(palabrasMasLargasQue(longitud));
	}
}
