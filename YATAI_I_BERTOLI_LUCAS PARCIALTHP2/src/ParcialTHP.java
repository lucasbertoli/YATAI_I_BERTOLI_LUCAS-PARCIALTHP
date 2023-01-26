

import java.util.Scanner;

public class ParcialTHP {
	public static final Scanner input = new Scanner(System.in);
	private static final int TOPE_MAXIMO = 1000;
	private static final int TOPE_MINIMO = 1;
	private static final String MAYOR = "MA";
	private static final String MENOR = "ME";
	private static final String IGUAL = "IG";

	public static void main(String[] args) {
		int num1, numnuevo, numactual = 0, puntos = 0;
		String eleccion;
		boolean correcto = false;

		num1 = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));
		System.out.println("el primero numero fue el " + num1);
		numactual = num1;

		do {
			correcto = false;
			do {
				System.out.println("como sera el proximo numero respecto a este? ([MA]yor, [ME]nor o [IG]ual)");
				eleccion = input.nextLine();
			} while (!eleccion.equals(MAYOR) && !eleccion.equals(MENOR) && !eleccion.equals(IGUAL));

			numnuevo = TOPE_MINIMO + (int) (Math.random() * (TOPE_MAXIMO - TOPE_MINIMO + 1));
			switch (eleccion) {
			case MAYOR:
				if (numactual < numnuevo) {
					puntos++;
					correcto = true;
				}
				break;
			case MENOR:
				if (numactual > numnuevo) {
					puntos++;
					correcto = true;
				}
				break;
			case IGUAL:
				if (numactual == numnuevo) {
					puntos++;
					correcto = true;
				}
			}
			if (correcto == true) {
				System.out.println("Acertaste!");
				System.out.println("Mi numero actual es el " + numnuevo + "( " + eleccion + " respecto al anterior)");
				numactual = numnuevo;
			}

		} while (correcto == true);
		System.out.println("Perdiste. Acertaste durante " + puntos + " rondas!");

	}

}
