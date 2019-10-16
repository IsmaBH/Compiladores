import java.util.*;
public class NodoNario{
	int cantidadH;
	int[][] dato;
	ArrayList<NodoNario> hijos;
	//Constructor de la clase
	public NodoNario(){
		hijos = new ArrayList<NodoNario>();
		this.dato = new int[3][3];
		this.cantidadH = 0;
	}
	public NodoNario(int[][] dato){
		hijos = new ArrayList<NodoNario>();
		this.dato = dato;
		this.cantidadH = 0;
	}
	//Metodos de la clase
	//Metodo que incrementa el numero de hijos en un nodo
	public void aumentarHijo(NodoNario nodo){
		hijos.add(nodo);
		cantidadH = hijos.size();
	}
	//Metodo que actualiza el numero de hijos
	public void actualizarNoHijos(){
		cantidadH = hijos.size();
	}
	//Metodo que muestra el dato guardado en el nodo
	public void verInfo(){
		System.out.println("El dato guardado es: "+dato);
	}
	//Metodo que imprime la cantidad de hijos que tiene el nodo
	public void verHijos(){
		System.out.println(cantidadH);
	}
	//Metodo que cambia el dato del nodo
	public void setDato(int[][] dato){
		this.dato = dato;
	}
	//Metodo que obtiene el dato del nodo
	public int[][] getDato(){
		return dato;
	}
	//etodo que obtiene el numero de hijos
	public int getHijos(){
		return cantidadH;
	}
	//Metodo que resta en uno la cantidad de hijos
	public void restarHijo(){
		cantidadH--;
	}
	//Metodo que retorna un nodo entero
	public NodoNario retornaNodo(){
		return this;
	}
}