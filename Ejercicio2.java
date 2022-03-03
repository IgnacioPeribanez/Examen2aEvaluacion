package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static int palabrasMasLargasQue(int longitud) {
		int contador = 0;	
		File file = new File("C:\\Users\\Salesianos\\Downloads\\textoExamen.txt");
		try {
			Scanner f = new Scanner(file);
			System.out.println();
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				linea = linea.replaceAll(",", " ").replaceAll("\\.", " ").replaceAll(":", " ");
				String[] lineaspearada = linea.split(" ");
				for (int i = 0; i < lineaspearada.length; i++) {
					if (lineaspearada[i].length() > longitud) {
						System.out.println(lineaspearada[i]);
						contador++;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return contador;
	}
	
	public static void main(String[] args) {
		int longitud = 5;
		System.out.println(palabrasMasLargasQue(longitud));
	}
}
