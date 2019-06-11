package es.maestredam.qa.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Clase para trabajar con objetos usuario
 * @author Luismi
 */
public class Usuario implements Serializable{
    
    private String nombre;
    private String nombreCompleto;
    private String clave;
    private boolean admin;
    private int puntuacionTotal=0;
    private int puntuacionUltima=0;
    private int numJugadas=0;
    
    /**
     * Constructor para crear usuario normal
     * @param nombre
     * @param nombreCompleto
     * @param clave
     * @param admin 
     */
    public Usuario(String nombre, String nombreCompleto, String clave, boolean admin){
        this.nombre=nombre;
        this.nombreCompleto=nombreCompleto;
        this.clave=clave;
        this.admin=admin;
    }
    
    /**
     * Constructor para crear usuario básico
     * @param nombre
     * @param clave 
     */
    public Usuario(String nombre, String clave){
        this.nombre=nombre;
        this.clave=clave;
    }
    
    /**
     * Constructor completo para crear usuario completo
     * @param nombre
     * @param nombreCompleto
     * @param clave
     * @param puntuacionTotal
     * @param puntuacionUltima
     * @param numJugadas 
     */
    public Usuario(String nombre, String nombreCompleto, String clave, int puntuacionTotal, int puntuacionUltima, int numJugadas) {
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
        this.clave = clave;
        this.puntuacionTotal = puntuacionTotal;
        this.puntuacionUltima = puntuacionUltima;
        this.numJugadas = numJugadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getClave() {
        return clave;
    }
    
    public boolean isAdmin() {
        return admin;
    }

    public int getPuntuacionTotal() {
        return puntuacionTotal;
    }

    public int getPuntuacionUltima() {
        return puntuacionUltima;
    }

    public int getNumJugadas() {
        return numJugadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void setTipoUsuario(boolean admin) {
        this.admin = admin;
    }

    public void setPuntuacionTotal(int puntuacionTotal) {
        this.puntuacionTotal = puntuacionTotal;
    }

    public void setPuntuacionUltima(int puntuacionUltima) {
        this.puntuacionUltima = puntuacionUltima;
    }

    public void setNumJugadas(int numJugadas) {
        this.numJugadas = numJugadas;
    }

    /**
     * Método equals sobreescrito para comparar objetos usuario
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        return true;
    }
    
    /**
     * Método toString sobreescrito para imprimir objetos usuario
     * @return 
     */
    @Override
    public String toString() {
        return "Usuario{Nombre=" + nombre + ", Nombre Completo=" + nombreCompleto + ", Clave=" + clave + ", Puntuación Total=" + puntuacionTotal + "Última puntuación=" + puntuacionUltima + "Número de jugadas=" + numJugadas +"}";
    }
    
    
    
}
