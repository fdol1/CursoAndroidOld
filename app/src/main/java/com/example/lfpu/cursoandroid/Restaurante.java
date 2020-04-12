package com.example.lfpu.cursoandroid;

public class Restaurante {

    private String nombres;
    private String urlFoto;
    private String direccion;
    private float valoracion;

    public Restaurante() {
    }

    public Restaurante(String nombres, String urlFoto, String direccion, float valoracion) {
        this.nombres = nombres;
        this.urlFoto = urlFoto;
        this.direccion = direccion;
        this.valoracion = valoracion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
}
