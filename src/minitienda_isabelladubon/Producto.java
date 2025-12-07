/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

public class Producto {
    private String producto;
    private final int ID;
    private double precio;
    private int stock;

    //constructor
    public Producto(String producto, int ID, double precio, int stock) {
        this.producto = producto;
        this.ID = ID;
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return producto + "\n" +
                "ID: " + ID + "\n" +
                "Precio: L. " + precio + "\n" +
                "In Stock: " + stock ;
    }
    
    
}
