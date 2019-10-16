import java.util.*;
public class Gato{
	public static void main(String[] args) {
		//En esta parte se prepara el arbol de decisiones
		ArbolN arbol = new ArbolN();
		NodoNario raiz = arbol.insertarRaiz();
		//Este Scanner se prepara para poder leer las acciones del jugador
		Scanner sc = new Scanner(System.in);
		//Se prepara el tablero en el que se jugara
		char[][] tablero = new char[3][3];
		//Se inicia el juego
		System.out.println("Bienvenido al juego del gato");
		System.out.println("El valor inicial del nodo raiz es: ");
		for (int i = 0; i < 3 ; i++ ) {
			for (int j = 0; j < 3 ; j++ ) {
                raiz.dato[i][j] = 0;
                //A[i][j] = sc.nextInt(); ejemplo de utilizacion para un numero
			}
		}
        for (int i = 0; i < raiz.dato.length; i++) { 
            for (int j = 0; j < raiz.dato[i].length; j++) {
                System.out.print(raiz.dato[i][j] + " ");
            }
            System.out.println();
        }
        //Inicializamos el valor del tablero igual que el nodo raiz
        tablero = raiz.dato;
        //Vamos a establecer que el jugador sera el jugador 1 y la IA sera el jugador 2
        //Esto significa que crearemos los primeros 9 nodos por default
        for (int i = 0; i <9 ; i ++ ) {
        	arbol.insertar(raiz, ,);
        }
        //A[i][j] = sc.nextLine(); ejemplo de utilizacion para un string
	}
}