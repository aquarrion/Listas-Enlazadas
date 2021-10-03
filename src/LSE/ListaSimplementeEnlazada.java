package LSE;

public class ListaSimplementeEnlazada {
     protected nodo primero;
    public ListaSimplementeEnlazada(){
        primero = null;
    }

    public boolean estaVacia(){
        return primero == null;
    }

    public void insertar(Object dato){
        if(estaVacia()){
            nodo nuevo = new nodo(dato, null);
            primero = nuevo;
        }else {
            nodo nuevo = new nodo (dato, primero);
            primero = nuevo;
        }
    }

    public void eliminar(){
        if(!estaVacia()){
            primero = primero.getSiguiente();
        }
    }
    public void mostrar(){
        nodo tmp = primero;
        while (tmp != null){
            System.out.println(tmp.getDato() + "      ");

            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }
}
