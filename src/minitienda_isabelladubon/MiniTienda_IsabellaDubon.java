/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minitienda_isabelladubon;

import java.util.ArrayList;
import minitienda_isabelladubon.GUI.Inicio;
import minitienda_isabelladubon.GUI.ElegirUser;
import minitienda_isabelladubon.GUI.UsuarioNew;
import minitienda_isabelladubon.GUI.Main;
import minitienda_isabelladubon.GUI.PantallaMain;
import java.util.Random;

public class MiniTienda_IsabellaDubon {

    public static void main(String[] args) {
        Random random = new Random();
        Producto[] tienda = new Producto[8];
        tienda[0] = new Producto("Pie de Limon","",40,10);
        tienda[1] = new Producto("Mini Pinia Loca","",25,10);
        tienda[2] = new Producto("Gomitas Enchiladas","",20,10);
        tienda[3] = new Producto("Pan de Minimo","",40,10);
        tienda[4] = new Producto("Te Frio","",20,10);
        tienda[5] = new Producto("Cafe","",12,10);
        tienda[6] = new Producto("Jabon Artesanal","",60,10);
        tienda[7] = new Producto("Pulcera","",30,10);
        
        //Inicializa el menu principal
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.setResizable(false);
    }
    
    public Pedido generarPedido (Usuario usuario, Producto[] tienda, int numPedido){
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();
        Random random = new Random();
        int nivel = usuario.getNivel();
        Pedido pedido = null;
        switch (nivel){ //niveles de pedidos
            case 1: 
                //nivel 1, genera solo un tipo de producto, cantidad Max = 3
                int index1 = random.nextInt(9);
                Producto producto1 = tienda[index1];
                productos.add(producto1);
                int cant = random.nextInt(4);
                cantidad.add(cant);
                pedido = new Pedido(productos, cantidad, numPedido);
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return pedido;
    }
    
}
