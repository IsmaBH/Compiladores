public class UsoArbolN{
	public static void main(String[] args) {
		ArbolN arbol = new ArbolN();
		NodoNario raiz = arbol.insertarRaiz("0");

		arbol.insertar(raiz, "1", "0");
		arbol.insertar(raiz, "2", "0");
		arbol.insertar(raiz, "3", "0");
		arbol.insertar(raiz, "4", "0");
		arbol.insertar(raiz, "1.1", "1");
		arbol.insertar(raiz, "1.2", "1");
		arbol.insertar(raiz, "2.1", "2");
		arbol.insertar(raiz, "2.2", "2");
		arbol.insertar(raiz, "3.1", "3");
		arbol.insertar(raiz, "3.2", "3");
		arbol.insertar(raiz, "3.1.1", "3.1");
		arbol.insertar(raiz, "3.1.2", "3.1");
		arbol.insertar(raiz, "3.1.1.4", "3.1.1");
		arbol.insertar(raiz, "1.1.1", "1.1");
		arbol.insertar(raiz, "1.1.2", "1.1");
		arbol.insertar(raiz, "1.1.1.2", "1.1.1");

		arbol.recorrer(raiz);
		System.out.println("Buscar: "+arbol.existe(raiz, "2", false));
		System.out.println("Cantidad: "+arbol.cantidadNodos(raiz));
		System.out.println("Altura: "+arbol.altura(raiz));
		System.out.println("Hojas: "+arbol.numeroHojas(raiz));
		System.out.println("Nivel Elemento: "+arbol.nivelElemento(raiz,"1.1",0));
		System.out.println("-------------------------");
		arbol.borrarNodo(raiz,"4",true);
		//arbol.recorrer(raiz);
		System.out.println("---------------------------");
		//arbol.recorrerHijosRaiz(raiz);
		System.out.println("---------------------------");
		arbol.recorrerAmplitud(raiz,arbol.altura(raiz));
	}
}