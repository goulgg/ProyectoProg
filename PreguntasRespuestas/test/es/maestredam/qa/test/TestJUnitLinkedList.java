package es.maestredam.qa.test;

import es.maestredam.util.LinkedList;
import javax.swing.JOptionPane;
import org.junit.runner.JUnitCore;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Luismi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJUnitLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JUnitCore.runClasses(TestJUnitLinkedList.class);
    }
    
    private LinkedList<Integer> lista;
    
    @Before
    public void crearLinkedList(){
        //Creo la lista antes de cada prueba
        lista = new LinkedList<>();
    }
    
    @Test
    public void test1Add(){
        //Añado un elemento
        lista.add(4);
        Assert.assertEquals(1,lista.size());
        //Añado otro elemento
        lista.add(2);
        Assert.assertEquals(2,lista.size());
    }
    
    @Test
    public void test2AddIndex(){
        //Añado un elemento
        lista.add(0, 1);
        Assert.assertEquals((int) 1,(int) lista.get(0));
        //Añado otro elemento
        lista.add(1, 2);
        Assert.assertEquals((int) 2,(int) lista.get(1));
    }
    
    @Test
    public void test3Size(){
        //Añado dos elementos a la lista vacía
        lista.add(5);
        lista.add(6);
        Assert.assertEquals(2,lista.size());
        //Añado un tercero
        lista.add(7);
        Assert.assertEquals(3,lista.size());
    }
    
    @Test
    public void test4IsEmpty(){
        //Lista vacía
        Assert.assertEquals(true,lista.isEmpty());
        //Añado un elemento y vuelvo a probar
        lista.add(1);
        Assert.assertEquals(false,lista.isEmpty());
    }
    
    @Test
    public void test5Get(){
        //Añado dos elementos a la lista
        lista.add(4);
        lista.add(1);
        Assert.assertEquals((int) 1,(int) lista.get(1));
        //Añado otro elemento
        lista.add(2);
        Assert.assertEquals((int) 2,(int) lista.get(2));
    }
    
    @Test
    public void test6Remove(){
        //Añado dos elementos
        lista.add(2);
        lista.add(3);
        //Borro el último
        lista.remove(1);
        Assert.assertEquals(1,lista.size());
        //Añado otro
        lista.add(1);
        //Borro el primer elemento
        lista.remove(0);
        Assert.assertEquals(1,lista.size());
    }
    
    @Test
    public void test7IndexOf(){
        //Pruebo un index con la lista vacía
        Assert.assertEquals(-1,lista.indexOf(1));
        //Añado un elemento
        lista.add(3);
        Assert.assertEquals(0,lista.indexOf(3));
    }
    
}
