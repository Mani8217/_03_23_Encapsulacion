package com.adecco.modelo;

public class Producto {


        //1. Attributoss
        private int numProducto;

        private String nombreProducto;

        private double precio;

        private int cantidadExitencia;
        //2. metodos
        //3.constructores
        //4. Setters y Getters
       // Asignar valores a Attributos

        public void setNumProducto(int numProducto){
                this.numProducto = numProducto;
        }

    public int getNumProducto(){
          return numProducto;
    }
    public void setNombreProducto(String nombreProducto){
            this.nombreProducto = nombreProducto;
    }
    public String getNombreProducto(){
            return nombreProducto;
    }


    public void setPrecio(double precio){
            this.precio = precio;
    }
    public double getPrecio(){
            return precio;
    }

    public int getCantidadExitencia() {
        return cantidadExitencia;
    }

    public void setCantidadExitencia(int cantidadExitencia) {
        this.cantidadExitencia = cantidadExitencia;
    }
}


