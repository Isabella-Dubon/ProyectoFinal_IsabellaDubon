/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minitienda_isabelladubon;

import minitienda_isabelladubon.GUI.Inicio;

public class MiniTienda_IsabellaDubon {

    public static void main(String[] args) {
        Producto[] tienda = new Producto[8];
        tienda[0] = new Producto("Pie de Limon",40,8);
        tienda[1] = new Producto("Mini Pinia Loca",25,8);
        tienda[2] = new Producto("Gomitas Enchiladas",20,8);
        tienda[3] = new Producto("Pan de Minimo",35,8);
        tienda[4] = new Producto("Te Frio",20,8);
        tienda[5] = new Producto("Cafe",12,8);
        tienda[6] = new Producto("Jabon Artesanal",60,8);
        tienda[7] = new Producto("Pulsera",25,8);
                
        //Inicializa el menu principal
        Inicio inicio = new Inicio(tienda);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.setResizable(false);
    }
    
}
