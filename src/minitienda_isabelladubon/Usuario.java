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
    private boolean[][] historialPedidos;
    private int indicePedido;
    private ArrayList<Factura> facturas;

    public Usuario() {
    }

    
    public Usuario(String nombre, double dinero, int diaEnJuego) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.diaEnJuego = diaEnJuego;
        this.facturas = new ArrayList<>();
        this.historialPedidos = new boolean[100][1];
        this.indicePedido = 0; 
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

    public boolean[][] getHistorialPedidos() {
        return historialPedidos;
    }

    public void setHistorialPedidos(boolean[][] diagramaPedidos) {
        this.historialPedidos = diagramaPedidos;
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

    public int getIndicePedido() {
        return indicePedido;
    }

    public void setIndicePedido(int indicePedido) {
        this.indicePedido = indicePedido;
    }
    
    public void vaciarHistorial() {
        this.historialPedidos = new boolean[100][1];
        this.indicePedido = 0;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Dinero: " + dinero + "\n" +
                "Dia " + diaEnJuego + "\n" ;
    }

    public void agregarResultadoPedido(boolean correcto) {
        historialPedidos[indicePedido][0] = correcto;
        indicePedido++;
    }
    
    
    
    
}
