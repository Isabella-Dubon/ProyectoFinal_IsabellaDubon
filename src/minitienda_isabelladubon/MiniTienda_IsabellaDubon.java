/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minitienda_isabelladubon;

import java.util.ArrayList;
import minitienda_isabelladubon.GUI.Inicio;

public class MiniTienda_IsabellaDubon {

    public static void main(String[] args) {
        Producto[] comida = new Producto[4];
        Producto[] bebidas = new Producto[2];
        Producto[] extras = new Producto[2];
        comida[0] = new Producto("Pie de Limon","",40,10);
        comida[1] = new Producto("Mini Pinia Loca","",25,10);
        comida[2] = new Producto("Gomitas Enchiladas","",20,10);
        comida[3] = new Producto("Pan de Minimo","",40,10);
        bebidas[0] = new Producto("Te Frio","",20,10);
        bebidas[0] = new Producto("Cafe","",12,10);
        bebidas[0] = new Producto("Jabon Artesanal","",60,10);
        bebidas[0] = new Producto("Pulcera","",30,10);
        
        //Inicializa el menu principal
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.setResizable(false);
        
        

    }
    
}
