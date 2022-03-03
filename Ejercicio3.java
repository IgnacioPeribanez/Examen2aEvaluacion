package examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	public static ArrayList<String> informacionVideojuegos() {
		ArrayList<String> pla = new ArrayList<String>();
		int contador = 0;	
		int casilla = 0;
		File file = new File("C:\\Users\\Salesianos\\Downloads\\ventasVideojuegos.csv");
		try {
			Scanner f = new Scanner(file);
			System.out.println();
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				if (contador > 0) {
					String[] lineascompletas = linea.split(",");
					System.out.println(lineascompletas.length);
					if (lineascompletas.length > 11) {
						int longitud = lineascompletas.length - 11;
						casilla = 2 + longitud;
					}  else {
						casilla = 2;
					}
						boolean encontrado = false;
						for (int z = 0; z < pla.size(); z++) {
							if (lineascompletas[casilla].equals(pla.get(z))) {
								encontrado = true;
								break;
							}
						}
						if (encontrado == false) {
							pla.add(lineascompletas[casilla]);
						}
				}else {
					contador ++;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return pla;
	}
	
	public static void main(String[] args) {
		ArrayList<String> pla = informacionVideojuegos();
		for(int i = 0; i < pla.size(); i++) {
			System.out.println(pla.get(i));
		}
	}
}
