package es.maestredam.qa.model;

import java.io.Serializable;

/**
 * Clase para trabajar con objetos pregunta
 * @author Luismi
 */
public class Pregunta implements Serializable{
    private String categoria;
    private String enunciado;
    private String respuestaValida;
    private String respuestaA;
    private String respuestaB;
    private String respuestaC;
    private int valoracion = 1;
    private int vecesExtraida = 0;
    
    /**
     * Constructor para crear una pregutna tipo test
     * @param categoria
     * @param enunciado
     * @param respuestaValida
     * @param respuestaA
     * @param respuestaB
     * @param respuestaC 
     */
    public Pregunta(String categoria, String enunciado, String respuestaValida, String respuestaA, String respuestaB, String respuestaC){
        this.categoria = categoria;
        this.enunciado = enunciado;
        this.respuestaValida = respuestaValida;
        this.respuestaA = respuestaA;
        this.respuestaB = respuestaB;
        this.respuestaC = respuestaC;
    }
    
    /**
     * Constructor para crear una pregunta corta
     * @param categoria
     * @param enunciado
     * @param respuestaA 
     */
    public Pregunta(String categoria, String enunciado, String respuestaA){
        this.categoria = categoria;
        this.enunciado = enunciado;
        this.respuestaA = respuestaA;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuestaValida() {
        return respuestaValida;
    }

    public void setRespuestaValida(String respuestaValida) {
        this.respuestaValida = respuestaValida;
    }

    public String getRespuestaA() {
        return respuestaA;
    }

    public void setRespuestaA(String respuestaA) {
        this.respuestaA = respuestaA;
    }

    public String getRespuestaB() {
        return respuestaB;
    }

    public void setRespuestaB(String respuestaB) {
        this.respuestaB = respuestaB;
    }

    public String getRespuestaC() {
        return respuestaC;
    }

    public void setRespuestaC(String respuestaC) {
        this.respuestaC = respuestaC;
    }

    public int getVecesExtraida() {
        return vecesExtraida;
    }
    
    public void setVecesExtraida(int vecesExtraida) {
        this.vecesExtraida = vecesExtraida;
    }

    public int getValoracion() {
        return valoracion;
    }
    
    /**
     * Método que comprueba si la respuesta de una pregunta tipo test es correcta
     * @param respuesta
     * @param pregunta
     * @return devuelve un booleano indicando si es correcta(true) o no(false)
     */
    public boolean compruebaTest(String respuesta, Pregunta pregunta){
        boolean comprobacion;
        if(respuesta.equals(pregunta.getRespuestaValida())){
            comprobacion = true;
            System.out.println("Correcto");
        }else{
            comprobacion = false;
            System.out.println("Pues no");
        }
        return comprobacion;
    }
    
    /**
     * Método que comprueba si la respuesta de una pregunta corta es correcta
     * @param respuesta
     * @param pregunta
     * @return devuelve un booleano indicando si es correcta(true) o no(false)
     */
    public boolean compruebaNormal(String respuesta, Pregunta pregunta){
        boolean comprobacion;
        if(respuesta.equalsIgnoreCase(pregunta.getRespuestaA())){
            comprobacion = true;
            System.out.println("Correcta");
        }else{
            comprobacion = false;
            System.out.println("Pues no");
        }
        return comprobacion;
    }
}