package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void informacionVideojuegos() {
		int contador = 0;	
		File file = new File("C:\\Users\\Salesianos\\Downloads\\ventasVideojuegos.csv,");
		try {
			Scanner f = new Scanner(file);
			System.out.println();
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				if (contador > 0) {
					String[] lineaspearada = linea.split(";");
					for (int i = 0; i < lineaspearada.length; i++) {
						
					}
				}else {
					contador ++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(informacionVideojuegos());
	}
}
