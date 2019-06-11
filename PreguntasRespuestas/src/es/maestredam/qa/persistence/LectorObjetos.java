package es.maestredam.qa.persistence;

import es.maestredam.util.LinkedList;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author Luismi
 */
public class LectorObjetos<T> implements Serializable{
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String fichero;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public LectorObjetos(String fichero) {
        this.fichero = fichero;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Operaciones">
    /**
     * Metodo lector de objetos
     * @return objeto leido o <b>null</b> en otro caso.
     */
    public LinkedList<T> leer(){
        T objLeido = null;
        LinkedList<T> lista = new LinkedList<>();
        
        try(ObjectInputStream ois = 
                new ObjectInputStream(
                        new FileInputStream(fichero))){
            
            while(true){
                objLeido = (T) ois.readObject();
                lista.add(objLeido);
            }            
            
        }catch (ClassNotFoundException ex) {
            System.out.printf("ERROR en Casting: %s%n", ex);
        }catch (FileNotFoundException ex) {
            System.out.printf("ERROR Fichero no encontrado: %s%n", ex);
        }catch (EOFException ex) {
            System.out.printf("Fin de Fichero alcanzado%n%s%n", fichero);
        }catch (IOException ex) {
            System.out.printf("ERROR E/S: %s%n", ex);
        }finally{        
            return lista; 
        }
    }
    //</editor-fold>
}