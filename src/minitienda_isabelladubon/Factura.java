/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

public class Factura {
    private int dia;
    private int numFactura;
    private Pedido pedido;
    private double total;

    public Factura(int dia, int numFactura, Pedido pedido, double total) {
        this.dia = dia;
        this.numFactura = numFactura;
        this.pedido = pedido;
        this.total = total;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Dia. : " + dia + "|" + "Num. : " + numFactura + "|" + pedido + "|" + "Total: L. " + total ;
    }
    
    
}
