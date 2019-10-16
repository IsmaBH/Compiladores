import java.util.*;
public class Gato{
	public static void main(String[] args) {
		ArbolN arbol = new ArbolN();
		NodoNario raiz = arbol.insertarRaiz();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al juego del gato");
		System.out.println("El valor inicial del nodo raiz es: ");
		for (int i = 0; i < 3 ; i++ ) {
			for (int j = 0; j < 3 ; j++ ) {
                raiz.dato[i][j] = 0;
                //A[i][j] = sc.nextInt(); ejemplo de utilizacion
			}
		}
        for (int i = 0; i < raiz.dato.length; i++) { 
            for (int j = 0; j < raiz.dato[i].length; j++) {
                System.out.print(raiz.dato[i][j] + " ");
            }
            System.out.println();
        }
	}
}