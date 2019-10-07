public class Abb {
    private class NodoArbol {
        private Abb hd;
        private Abb hi;
        private int dato;
        //Constructor de la clase privada nodoArbol
        private void NodoArbol(){
            hd = null;
            hi = null;
            dato = 0;
        }
    }

    public NodoArbol raiz;
    //Constructor de la clase arbol de busqueda binario (abb)
    public void Abb(){
        NodoArbol raiz = new NodoArbol();
    }
    //Metodo para saber si un arbol esta vacio
    public boolean esVacio(){
        return (raiz == null);
    }
    //Metodo para insertar un nuevo nivel de nodos al arbol
    //Este metodo cambiara segun las necesidades de la implementacion
    public void insertar(int a){
        if (esVacio()) {
            NodoArbol nuevo = new NodoArbol();
            nuevo.dato = a;
            nuevo.hd = new Abb();
            nuevo.hi = new Abb();
            raiz = nuevo;
        }else {
            if (a > raiz.dato) {
                (raiz.hd).insertar(a);
            }
            if (a < raiz.dato){
                (raiz.hi).insertar(a);
            }
        }
    }
    //Metodo para recorrer el arbol en preorden
    public void preOrder(){
        if (!esVacio()) {
            System.out.print( raiz.dato + ", "  );
            raiz.hi.preOrder();
            raiz.hd.preOrder();
        }
    }
    //Metodo para recorrer el arbol en inorden
    public void inOrder(){
        if (!esVacio()) {
            raiz.hi.inOrder();
            System.out.print( raiz.dato + ", "  );
            raiz.hd.inOrder();
        }
    }
    //Metodo para recorrer el arbol en posorden
    public void posOrder(){
        if (!esVacio()) {
            raiz.hd.posOrder();
            raiz.hi.posOrder();
            System.out.print( raiz.dato + ", "  );
        }
    }
    //Metodo de busqueda, este metodo es el que se modificara
    //de acuerdo al algoritmo de busqueda que se este usando
    public Abb buscar(int a){
        Abb arbolito = null;
        if (!esVacio()) {
            if (a == raiz.dato) {
            return this;
            }
            else {
                if (a < raiz.dato) {
                    arbolito = raiz.hi.buscar(a);
                }
                else {
                    arbolito = raiz.hd.buscar(a);
                }
            }
        }
        return arbolito;
    }
    //Metodo que verifica que exista un nodo determinado(Por revisar funcionamiento)
    public boolean existe(int a){
        if (!esVacio()) {
            if (a == raiz.dato) {
                return true;
            }else {
                if (a < raiz.dato) {
                    raiz.hi.existe(a);
                }else {
                    raiz.hd.existe(a);
                }
            }
        }
        return false;
    }
    //Metodo que regresa la cantidad de nodos que extisten
    public int cantidad(){
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + raiz.hd.cantidad() + raiz.hi.cantidad());
        }
    }
    //Metodo que nos dice la altura o cantidad de niveles que existen
    public int altura() {
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + Math.max(((raiz.hi).altura()), ((raiz.hd).altura())));
        }
    }

    public int buscarMin() {
        Abb arbolActual = this;
        while( !arbolActual.raiz.hi.esVacio() ) {
            arbolActual = arbolActual.raiz.hi;
        }
        int devuelvo= arbolActual.raiz.dato;
        arbolActual.raiz=null;
        return devuelvo;
    }

    public int buscarMan() {
        Abb arbolActual = this;
        while( !arbolActual.raiz.hd.esVacio() ) {
            arbolActual = arbolActual.raiz.hd;
        }
        int devuelvo= arbolActual.raiz.dato;
        arbolActual.raiz=null;
        return devuelvo;
    }
    //Metodo que nos ayuda a sabes si un nodo es un nodo hoja
    public boolean esHoja() {
        boolean hoja = false;
        if( (raiz.hi).esVacio() && (raiz.hd).esVacio() ) {
            hoja = true;
        }
        return hoja;
    }
    //Metodo que nos permite eliminar una rama del arbol
    public void eliminar(int a) {
        Abb paraEliminar = buscar(a);
        if (!paraEliminar.esVacio()) {
            if (paraEliminar.esHoja()) {
                paraEliminar.raiz = null;
            }else {
                if (!paraEliminar.raiz.hi.esVacio() && !paraEliminar.raiz.hd.esVacio()) {
                    paraEliminar.raiz.dato = paraEliminar.raiz.hd.buscarMin();
                }else {
                    if (paraEliminar.raiz.hi.esVacio()) {
                        paraEliminar.raiz = paraEliminar.raiz.hd.raiz;
                    }else{
                        paraEliminar.raiz = paraEliminar.raiz.hi.raiz;
                    }
                }
            }
        }
    }
}