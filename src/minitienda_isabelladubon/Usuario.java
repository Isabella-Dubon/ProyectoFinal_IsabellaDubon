/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

public class Usuario {
    private String nombre;
    private double dinero;
    private int diaEnJuego;
    private int nivel;

    public Usuario(String nombre, double dinero, int diaEnJuego, int nivel) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.diaEnJuego = diaEnJuego;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getDiaEnJuego() {
        return diaEnJuego;
    }

    public void setDiaEnJuego(int diaEnJuego) {
        this.diaEnJuego = diaEnJuego;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Dinero: " + dinero + "\n" +
                "Dia " + diaEnJuego + "\n" +
                "Nivel " + nivel ;
    }

    
    
    
    
}
