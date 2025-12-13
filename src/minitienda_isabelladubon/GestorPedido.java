/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minitienda_isabelladubon;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author miria
 */
public class GestorPedido {
    public Pedido generarPedido (Usuario usuario, Producto[] tienda, int numPedido ){
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();
        Random random = new Random();
        int cantPedidos = random.nextInt(1, 4);
        while (productos.size() < cantPedidos){
            int index = random.nextInt(tienda.length);
            Producto producto1 = tienda[index];
            if (!productos.contains(producto1)){
                productos.add(producto1);
                int cant = random.nextInt(1, 4);
                cantidad.add(cant);
            }
            
        }
        Pedido pedido = new Pedido(productos, cantidad, numPedido);
        return pedido;
    }
    public boolean validarEntrega(Pedido pedidoOriginal, Pedido pedidoIngresado) {
        
        //obtener los productos y cantidades del pedido original
        ArrayList<Producto> pedidoOriginalProductos = pedidoOriginal.getPedido();
        ArrayList<Integer> pedidoOriginalCantidades = pedidoOriginal.getCantidades();
        
        //obtener los productos y cantidades del pedido ingresado por el usuario
        ArrayList<Producto> productosIngresados = pedidoIngresado.getPedido();
        ArrayList<Integer> cantidadesIngresadas = pedidoIngresado.getCantidades();

        boolean correcto = true;

        //misma cantidad de productos
        if (pedidoOriginalProductos.size() != productosIngresados.size()) {
            return false;
        }

        //comparar productos
        for (int i = 0; i < pedidoOriginalProductos.size(); i++) {
            Producto pOriginal = pedidoOriginalProductos.get(i);
            int cantOriginal = pedidoOriginalCantidades.get(i);
            
            boolean encontrado = false;
            
            // buscar si el producto existe en los ingresados
            for (int j = 0; j < productosIngresados.size(); j++) {
                if (productosIngresados.get(j).getProducto().equals(pOriginal.getProducto())) {
                    encontrado = true;
                    
                    //comparar cantidades
                    if (cantidadesIngresadas.get(j) != cantOriginal) {
                        return false; // Error: Cantidad diferente
                    }
                    break; 
                }
            }
            
            if (!encontrado) {
                return false; // Error: Falta un producto original en la lista ingresada
            }
        }
        
        return correcto; // Si el loop termina sin retornar false, es correcto.
    }

}
