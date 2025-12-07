/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minitienda_isabelladubon;

import java.util.ArrayList;
import minitienda_isabelladubon.GUI.Inicio;

public class MiniTienda_IsabellaDubon {

    public static void main(String[] args) {
        ArrayList<Producto> comida = new ArrayList<>();
        ArrayList<Producto> bebidas = new ArrayList<>();
        ArrayList<Producto> extras = new ArrayList<>();
        comida.add(new Producto("Pie de Limon","",40,15));
        comida.add(new Producto("Mini Pinia Loca","",25,15));
        comida.add(new Producto("Gomitas Enchiladas","",20,15));
        comida.add(new Producto("Pan de Minimo","",40,15));
        bebidas.add(new Producto("Te Frio","",20,15));
        bebidas.add(new Producto("Cafe","",12,15));
        extras.add(new Producto("Jabon Artesanal","",60,15));
        extras.add(new Producto("Pulcera","",30,15));
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.setResizable(false);
        
        

    }
    
}
