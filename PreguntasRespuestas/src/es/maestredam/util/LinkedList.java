package es.maestredam.util;

import java.io.Serializable;

/**
 * @author Luismi
 */
public class LinkedList<E> implements Serializable{
    /*
    Clase interna Nodo
    */
    private class Nodo{
        E obj;
        Nodo sig;
        
        public Nodo(E obj){
            this.obj = obj;
            this.sig = null;
        }
    }
    
    /*
    Clase LinkedList
    */
    
    private Nodo head;
    private int nroNodos;
    
    public LinkedList(){
        this.head = null;
        this.nroNodos = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public boolean add(E element){
        Nodo toAdd = new Nodo(element);
        
        if(isEmpty()){
            head = toAdd;
            nroNodos++;
            return true;
        }
        
        Nodo aux = head;
        while(aux.sig != null){
            aux = aux.sig;
        }
        
        aux.sig = toAdd;
        nroNodos++;
        return true;
    }
    
    public void print(){
        Nodo aux = head;
        System.out.print("[ ");
        while(aux.sig != null){
            System.out.print(aux.obj.toString()+" , ");
            aux = aux.sig;
        }
        System.out.println(aux.obj.toString()+" ]");
    }
    
    public int size() {
        return nroNodos;
    }

    public E get(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        
        Nodo n = head;
        for(int i=0; i<index;i++){
            n = n.sig;
        }
        return n.obj;
    }
    
    public E remove(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        
        Nodo act = head;
        Nodo ant = null;
        //Encontrar el nodo y su anterior;
        for(int i=0; i<index;i++){
            ant = act;
            act = act.sig;
        }
        E data = act.obj;
        
        //Reconectar la lista: casos:
        
        //Caso Especial: lista con un solo nodo
        if(act.sig == null && ant == null){
            head = null;
            nroNodos--;
            return data;
        }
        
        //Caso Especial: Es el primer nodo:
        if(act.sig != null && ant == null){
            head = act.sig;
            nroNodos--;
            return data;
        } 
        
        //Caso General: Nodo en el medio:
        ant.sig = act.sig;
        nroNodos--;
        return data;
    }
    
    public int indexOf(E element){
        //Lista vacía
        if(isEmpty())
            return -1;
        
        //Buscamos el elemento en la lista
        Nodo aux = head;
        int posicion = 0;
        while(aux.sig != null){
            if(aux.obj.equals(element))
                return posicion;
            
            aux = aux.sig;
            posicion++;
        }
        //Comprobar si es el ultimo elemento
        if(aux.obj.equals(element))
            return posicion;
        //Si no lo hemos encontrado
        return -1;        
    }
    
    public void add(int index, E element){
        //El elemento es nulo
        if(element == null)
            throw new NullPointerException();
        //El indice está fuera del rango alcanzable
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        
        
        Nodo toAdd = new Nodo(element);
        
        Nodo act=head;
        Nodo ant=null;
        for(int i=0; i<index;i++){
            ant = act;
            act = act.sig;
        }
        //Caso 1: Es el primer nodo:
        if(ant == null){
            toAdd.sig = head;
            head = toAdd;
            nroNodos++;
            return;
        }
        //Caso 2: Es el ultimo nodo:
        if(index == size()){
            add(element);
            return;
        }
        //Caso 3 (General): El nodo esta en el medio
        ant.sig = toAdd;
        nroNodos++;
        toAdd.sig = act;        
    }
    
    
}