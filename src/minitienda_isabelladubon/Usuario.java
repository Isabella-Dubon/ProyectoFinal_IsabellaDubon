/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

public class Usuario {
    private String nombre;
    private double dinero;
    private int diaEnJuego;

    public Usuario(String nombre, double dinero, int diaEnJuego) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.diaEnJuego = diaEnJuego;
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Dinero: " + dinero + "\n" +
                "Dia " + diaEnJuego;
    }

    
    
    
    
}
