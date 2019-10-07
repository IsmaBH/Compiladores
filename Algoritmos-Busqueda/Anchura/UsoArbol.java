public class UsoArbol{
	public static void main(String[] args) {
		//Instanciamos la clase arbol
		Abb arbol = new Abb();
		//Tendremos una clase arbol auxiliar
		Abb arbolAux;
		//Empezaremos por insertar algunos nodos
		arbol.insertar(1);
		arbol.insertar(2);
		arbol.insertar(4);
		arbol.insertar(6);
		arbol.insertar(5);
		arbol.insertar(8);
		arbol.insertar(7);
		//Recorremos el arbol en pre-orden
		arbol.preOrder();
		System.out.println("");
		//Ahora en inorden
		arbol.inOrder();
		System.out.println("");
		//Ahora en pos-orden
		arbol.posOrder();
		System.out.println("");
		//Ahora buscaremos un dato (Este metodo es importante)
		arbolAux = arbol.buscar(7);
		arbolAux.inOrder();
		System.out.println("");
		//Ahora preguntamos la cantidad de nodos
		Integer c = arbol.cantidad();
		System.out.println("La cantidad de nodos es: "+c);
		//Ahora preguntamos la cantidad de niveles que tiene
		Integer l = arbol.altura();
		System.out.println("La altura es igual a: "+l);
		//Ahora preguntaremos si el nodo que buscamos es un nodo hoja
		boolean h = arbolAux.esHoja();
		System.out.println("El nodo que se busco es hoja: "+h);
	}
}