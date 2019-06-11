package es.maestredam.qa.persistence;

import es.maestredam.util.LinkedList;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Luismi
 */
public class EscritorObjetos<T> implements Serializable{
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Ruta y nombre del fichero donde vamos a escribir.
     */
    private String fichero;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor de clase.
     * @param fichero ruta y nombre del fichero donde escribir.
     */
    public EscritorObjetos(String fichero) {
        this.fichero = fichero;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Operaciones">
    /**
     * Método que escribe un objeto en el fichero de destino
     * @param obj Objeto a escribir
     * @param append escribir con o sin sobreescritura
     */
    public void escribir(T obj, boolean append){
        LinkedList<T> elemento = new LinkedList<>();
        elemento.add(obj);
        escribir(elemento, append);
    }
    
    /**
     * Metodo que escribe una lista de elementos
     * @param objs
     * @param append 
     */
    public void escribir(LinkedList<T> objs, boolean append){
        File archivo = new File(fichero);
        if (!archivo.exists()) {
            append = false;
        }
        
        if(!append){ //Escritura sin añadir al final
            try(java.io.ObjectOutputStream oos = 
                    new java.io.ObjectOutputStream(
                            new FileOutputStream(fichero))){

                for(int i = 0; i<objs.size();i++)
                    oos.writeObject(objs.get(i));

            } catch (IOException ex) {
                System.out.printf("ERROR E/S: %s%n", ex);
            }
        }else{ //Escritura añadiendo al final
            try(es.maestredam.io.ObjectOutputStream oos = 
                    new es.maestredam.io.ObjectOutputStream(
                            new FileOutputStream(fichero, true))){

                for(int i = 0; i<objs.size();i++)
                    oos.writeObject(objs.get(i));

            } catch (IOException ex) {
                System.out.printf("ERROR E/S: %s%n", ex);
            }
        }
    }
    //</editor-fold>
}