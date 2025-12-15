/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

import java.util.Objects;
import java.util.Random;

public class Producto {
    private String producto;
    private final String ID;
    private double precio;
    private int stock;

    //constructor
    public Producto(String producto, double precio, int stock) {
        this.producto = producto;
        this.ID = generarID();
        this.precio = precio;
        this.stock = stock;
    }
    
    //getters y setters
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    private String generarID(){
        Random random = new Random();
        String IDgenerado = "";
        for (int i = 0; i <= 8; i++){ //genera un codigo random de 8 numeros
            IDgenerado += random.nextInt(9);
        }
        return IDgenerado;
    }
    public String getID() {
        return ID;
    }
    
    @Override
    public String toString() {
        return producto + " | " + "ID: " + ID + " | " + "Precio: L. " + precio + " | " + "In Stock: " + stock ;
    }

    
}