/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> comida;
    private ArrayList<Producto> bebida;
    private ArrayList<Producto> extra;
    private ArrayList<Integer> cantidades;
    private int numPedido;

    public Pedido(ArrayList<Producto> comida, ArrayList<Producto> bebida, ArrayList<Producto> extra, ArrayList<Integer> cantidades, int numPedido) {
        this.comida = comida;
        this.bebida = bebida;
        this.extra = extra;
        this.cantidades = cantidades;
        this.numPedido = numPedido;
    }

    public ArrayList<Producto> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Producto> comida) {
        this.comida = comida;
    }

    public ArrayList<Producto> getBebida() {
        return bebida;
    }

    public void setBebida(ArrayList<Producto> bebida) {
        this.bebida = bebida;
    }

    public ArrayList<Producto> getExtra() {
        return extra;
    }

    public void setExtra(ArrayList<Producto> extra) {
        this.extra = extra;
    }

    public ArrayList<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(ArrayList<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    
}
