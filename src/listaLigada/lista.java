/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLigada;

/**
 *
 * @author guada
 */
public class lista {

private Nodo head;//Apuntador a la cabecera de la lista (primer nodo)
    private Nodo tail;//Apuntador a la cola de la lista (ultimo nodo)
    private Nodo actual;//Apuntador al nodo seleccionado actualmente
    private int size;//tamaño de la lista (numero de nodos en la lista)

    public lista() {
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;
    }
/*
    public void addFirst(int dato) {
        Nodo nodo = new Nodo(dato);
        this.head = nodo;
        this.tail = nodo;
        this.actual = nodo;
        this.size++;
    }
*/
    public void add(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        this.size++;
        tail = nuevoNodo;//Se mueve el apuntador al ultimo nodo
        
        if(head == null){ //se mueve vel apuntador al ultimo nodo
            head = nuevoNodo;
            actual = head;
        }
        else{
            
        }
        //setSiguuiente: enlaza al siguiente nodo
        actual.setSiguiente(nuevoNodo);//actual apunta al nuevo nodo
        actual = nuevoNodo;//Ahora actual es el nuevo nodo
    }
    
    public void add(int dato, int posicion){//mismo nombre diferentes datos 
        Nodo nuevoNodo = new Nodo(dato);
        int i=1;
        actual =head;
        while(i<posicion -1){
            actual = actual.getSiguiente();
            i++;
        }
        
        Nodo auxiliar = actual.getSiguiente();
        actual.setSiguiente(nuevoNodo);
        actual = nuevoNodo;
        actual.setSiguiente(auxiliar);
    }
    
    public void printList(){//recorrido de la lista
        int posicion = 1;
        actual = head;//es la cabecera
        while(actual != null){//mientras actual no sea nulo avanza un nodo
            int elemento = actual.getDato();
            System.out.println("Dato = " + elemento + " almacenado en nodo: " + posicion);//actual apunta a "almacenado en nodo"
            actual = actual.getSiguiente();//getSiguiente obtiene el enlace 
            posicion++;
        }
    }
}


//nota:a traves de cada getSiguiente 