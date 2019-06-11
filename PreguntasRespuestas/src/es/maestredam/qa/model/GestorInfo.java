package es.maestredam.qa.model;

import es.maestredam.qa.persistence.*;
import es.maestredam.util.LinkedList;
import java.io.Serializable;

/**
 * Clase que recoge el escritor y el lector de ficheros en una sola
 * @author Luismi
 */
public class GestorInfo implements Serializable{
    private EscritorObjetos escritor;
    private LectorObjetos lector;
    
    public GestorInfo(String ruta){
        escritor = new EscritorObjetos(ruta);
        lector = new LectorObjetos(ruta);
    }

    public EscritorObjetos getEscritor() {
        return escritor;
    }

    public LectorObjetos getLector() {
        return lector;
    }
    
    /**
     * Método que carga el fichero en una LinkedList
     * @return devuelve la lista con el contenido del fichero
     */
    public LinkedList cargarArchivo(){
        LinkedList lista=lector.leer();
        return lista;
    }
    
    /**
     * Método que escribe en el fichero una lista pasada por parámetro junto con un booleano que
     * si es 'true' escribe a continuación de lo último escrito y si es 'false' reescribe el fichero desde cero
     * @param lista
     * @param append 
     */
    public void escribirLista(LinkedList lista, boolean append){
        escritor.escribir(lista, append);
    }
    
    /**
     * Método que escribe en el fichero un objeto pasado por parámetro junto con un booleano que
     * si es 'true' escribe a continuación de lo último escrito y si es 'false' reescribe el fichero desde cero
     * @param objeto
     * @param append 
     */
    public void escribirObjeto(Object objeto, boolean append){
        escritor.escribir(objeto, append);
    }
}
