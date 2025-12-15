/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private double dinero;
    private int diaEnJuego;
    private boolean[][] diagramaPedidos;
    private ArrayList<Factura> facturas;

    public Usuario() {
    }

    
    public Usuario(String nombre, double dinero, int diaEnJuego, boolean[][] diagramaPedidos, ArrayList<Factura> facturas) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.diaEnJuego = diaEnJuego;
        this.diagramaPedidos = diagramaPedidos;
        this.facturas = facturas;
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

    public boolean[][] getDiagramaPedidos() {
        return diagramaPedidos;
    }

    public void setDiagramaPedidos(boolean[][] diagramaPedidos) {
        this.diagramaPedidos = diagramaPedidos;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    public void agregarFactura(Factura factura) {
        this.facturas.add(factura);
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Dinero: " + dinero + "\n" +
                "Dia " + diaEnJuego + "\n" ;
    }

    
    
    
    
}
