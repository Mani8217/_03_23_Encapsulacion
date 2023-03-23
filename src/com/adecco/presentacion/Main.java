package com.adecco.presentacion;
import com.adecco.modelo.Producto;
public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto();

        p1.setNumProducto(1);
        System.out.println("IdProducto -> " +p1.getNumProducto());
        p1.setNombreProducto("Raton inalamrico");
        System.out.println("Nombre de producto -> " + p1.getNombreProducto());
        p1.setPrecio(22.33);
        System.out.println("El precio de producto es " + p1.getPrecio());
        p1.setCantidadExitencia(100);
        System.out.println("Cantidad en existencia -> " + p1.getCantidadExitencia());
    }
}