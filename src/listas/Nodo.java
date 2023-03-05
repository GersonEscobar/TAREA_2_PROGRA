
package listas;

/**
 *
 * @author Gerson
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;
    //para insertar al final
    public Nodo(int d){
        this.dato = d;
    }
    //para insertar al inicio
    public Nodo(int d, Nodo n){
        dato=d;
        siguiente=n;
    }
}
