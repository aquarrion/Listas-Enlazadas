package LSE;

public class nodo {
    private Object dato;
    private nodo siguiente;

    public nodo(Object dato, nodo siguiente) {
        this.setDato(dato);
        this.setSiguiente(siguiente);
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
