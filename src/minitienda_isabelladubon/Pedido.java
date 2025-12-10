/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> pedido;
    private ArrayList<Integer> cantidades;
    private int numPedido;

    public Pedido(ArrayList<Producto> pedido, ArrayList<Integer> cantidades, int numPedido) {
        this.pedido = pedido;
        this.cantidades = cantidades;
        this.numPedido = numPedido;
    }

    public ArrayList<Producto> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Producto> pedido) {
        this.pedido = pedido;
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

    @Override
    public String toString() {
        String pedidos = "";
        String cants = "";
        for (int i = 0; i < cantidades.size(); i++){
            cants += cantidades.get(i) + "\n";
            for (int j = 0; j < pedido.size(); j++){ 
                pedidos += pedido.get(j).getProducto() + "\n";
            }
        }
        return cants + " " + pedidos ;
    }

    
}
