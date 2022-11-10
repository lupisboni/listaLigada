/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLigada;

/**
 *
 * @author guada
 */
public class Nodo <T> {
   private T dato;//dato almacenado
    private Nodo siguiente;//apuntador al siguiente nodo
    
        public Nodo(T d){
            this.dato = d;
            this.siguiente = null;
        }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo otroNodo) {
        this.siguiente = otroNodo;
    }
        
        
}