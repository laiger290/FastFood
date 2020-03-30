package com.example.fastfood;

public class objeto {
    private String nombre;
    private int identificador;
    private String descripcion;
    private String precio;
    public objeto(){

    }

    public objeto(String nombre,int identificador,String descripcion,String precio){
        this.nombre=nombre;
        this.identificador=identificador;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }


    @Override
    public String toString() {
        return nombre;
    }

}
