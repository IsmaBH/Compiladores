public class ArbolN{
	NodoNario raiz;
	public ArbolN(){
		//Vacio
	}
	public NodoNario insertarRaiz(String dato){
		raiz = new NodoNario(dato);
		return raiz;
	}
	//Metodos para insertar un nodo al arbol
	public void insertar(NodoNario nodo,String dato, String padre){
		NodoNario nuevo = new NodoNario(dato);
		//Verificamos si el padre es la raiz
		if (nodo.getDato().equals(padre)) {
			nodo.aumentarHijo(nuevo);
		}else{
			//Busca entre los hijos el padre
			for (int i = 0; i < nodo.getHijos() ; i++ ) {
				if (nodo.hijos.get(i).getDato().equals(padre)) {
					//Se coloca el hijo en el nodo
					nodo.hijos.get(i).aumentarHijo(nuevo);
				}else {
					//Busca el padre en los hijos del nodo
					insertar(nodo.hijos.get(i), dato, padre);
				}
			}
		}//Aqui termina el else
	}//Aqui termina le metodo
	//Metodo para recorrer los hijos del arbol (Busqueda primero en profundidad)
	public void recorrer(NodoNario raiz){
		raiz.verInfo();
		for (int i = 0; i < raiz.getHijos() ; i++ ) {
			recorrer(raiz.hijos.get(i));
		}
	}
	//Metodo de recorrimiento 2 (Tambien profundidad pero desde lo particular)
	public void recorrerHijosRaiz(NodoNario raiz){
		for (int i = 0; i < raiz.getHijos() ; i++ ) {
			recorrerHijosRaiz(raiz.hijos.get(i));
		}
		raiz.verInfo();
	}
	//Metodo de amplitud (En desarrollo)
	public void recorrerAmplitud(NodoNario raiz, int altura){
		raiz.verInfo();
		for (int j = 0; j < altura ; j++ ) {
			for (int i = 0; i < raiz.getHijos() ; i++ ) {
				raiz.hijos.get(i).verInfo();
				i = j;
			}
			recorrerAmplitud(raiz.hijos.get(j), altura-1);	
		}
	}
	//Metodo que busca que exista un dato en el arbol
	public boolean existe(NodoNario raiz, String buscar, boolean encontrado){
		if (raiz.getDato().equals(buscar)) {
			encontrado = true;
		}
		for (int i = 0; i < raiz.getHijos() ; i++) {
			encontrado = existe(raiz.hijos.get(i), buscar, encontrado);
		}
		return encontrado;
	}
	//Metodo que cuenta la cantidad de nodos
	public int cantidadNodos(NodoNario raiz){
		int mayor = 0;
		if (raiz == null) {
			return 0;
		}else{
			for (int i = 0; i < raiz.getHijos() ; i++ ) {
				mayor += cantidadNodos(raiz.hijos.get(i));
			}
			return mayor+1;
		}
	}
	//Metodo que calcula la altura del arbol
	public int altura(NodoNario raiz){
		int mayor = 0;
		int tempo = 0;
		if (raiz == null) {
			return 0;
		}else{
			for (int i = 0; i < raiz.getHijos() ; i++ ) {
				tempo = altura(raiz.hijos.get(i));
				if (tempo > mayor) {
					mayor = tempo;
				}
			}
			return mayor+1;
		}
	}
	//Metodo para contar el numero de hojas en el arbol
	public int numeroHojas(NodoNario raiz){
		int acnum = 0;
		if (raiz.getHijos() == 0) {
			return 1;
		}else {
			for (int i = 0; i < raiz.getHijos() ; i++ ) {
				acnum += numeroHojas(raiz.hijos.get(i));
			}
			return acnum;
		}
	}
	//Metodo que nos dice en que nivel esta un elemento
	public int nivelElemento(NodoNario raiz, String elemento, int nivel){
		int tempo = 0;
		if (raiz == null) {
			return -1;
		}else {
			if (raiz.getDato().equals(elemento)) {
				return nivel+1;
			}else {
				//Se busca en los hijos
				for (int i = 0; i < raiz.getHijos() ; i++ ) {
					tempo = nivelElemento(raiz.hijos.get(i), elemento, nivel+1);
					if (tempo != -1) {
						return tempo;
					}
				}
				return -1;
			}
		}
	}
	//Metodo para borrar un nodo, vease que primero hay que buscarlo
	public void borrarNodo(NodoNario raiz, String borrar, boolean rama){
		for (int i = 0; i < raiz.getHijos() ; i++ ) {
			//De borrarse debe borrarse toda la rama
			if (raiz.hijos.get(i).getDato().equals(borrar)
				&& raiz.hijos.get(i).getHijos() != 0 && rama) {
				raiz.hijos.remove(i);
				raiz.actualizarNoHijos();
				break;
			}else{
				if (raiz.hijos.get(i).getDato().equals(borrar) &&
					raiz.hijos.get(i).getHijos() == 0) {
					raiz.hijos.remove(i);
					raiz.actualizarNoHijos();
					break;
				}
			}
			borrarNodo(raiz.hijos.get(i), borrar, rama);
		}
	}
}