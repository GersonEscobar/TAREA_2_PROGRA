
package listas;

/**
 *
 * @author Gerson
 */
public class Listas {
    //punteros para identificar el inicio y fin
    protected Nodo inicio, fin;
    public Listas(){
        inicio = null;
        fin= null;
    }
    //metodo para poder agregar nodo al inicio
    public void Agregar(int elemento){
       //Crear al nodo 
       inicio = new Nodo(elemento, inicio);
       if (fin == null){
           fin = inicio;
       }
    }
    //Mostrar datos
    public void Mostrar(){
        Nodo recorrer=inicio;
        System.out.println("");
        while(recorrer!= null){
            System.out.print("["+recorrer.dato+"] ->");
            recorrer=recorrer.siguiente;
        }
    }
}
