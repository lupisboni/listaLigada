/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaLigada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author guada
 */
public class TestingListaLigada {
    
    public static void main(String[] args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato;
        char respuesta;
       
        
        lista lista = new lista();
        
       while(true){//ciclo infinito
        System.out.println("Escribe un dato entero");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);
            System.out.println("Se ha agregado el dato a la lista");
            System.out.println("¿Quieres agregar mas datos? (s/n): ");
            entrada=bufer.readLine();
            respuesta=entrada.charAt(0);
            if(respuesta == 'n' || respuesta == 'N')
                break;
        }
       
        //se inserto un dato a una posicion 
        System.out.println("--------------------------------------");
        System.out.println("Contenido de la lista ligada");
        lista.printList();
        
        System.out.println("--------------------------");
        System.out.println("Inserccion de un nuevo numero");
        System.out.println("escribe el elemento a insertar: ");
        entrada=bufer.readLine();
        dato=Integer.parseInt(entrada);
        System.out.println("Escriba la posicion en donde quieras insertar:");
        entrada=bufer.readLine();
        int p =Integer.parseInt(entrada);
        lista.add(dato,p);//se envia un dato y una posicion para insertar el nodo,permite insertar un nuvo nodo a una posicion
        
        System.out.println("--------------------------------------");
        System.out.println("Contenido de la lista ligada:");
        lista.printList();
        
    }
}