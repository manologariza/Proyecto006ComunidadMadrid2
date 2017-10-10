package com.example.manolo.proyecto006comunidadmadrid2;

/**
 * Created by Jorge on 09/10/2017.
 */

public class Ciudad {

    // ARRAYS QUE ALMACENAN LA INFORMACION DE LA APLICACION
    private String[] ciudad = {"Madrid", "Alcala", "Mostoles", "Torrejon"};
    private String[] poblacion = {"4000000", "200000", "201000", "100000"};
    private String[] gentilicio = {"Madrileñ@", "Alcalain@", "Mostoleñ@", "Torrejoner@"};
    private int[] escudos = {R.drawable.madrid, R.drawable.alcala, R.drawable.mostoles, R.drawable.torrejon};

    public String[] getCiudad() {
        return ciudad;
    }

    public void setCiudad(String[] ciudad) {
        this.ciudad = ciudad;
    }

    public String[] getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String[] poblacion) {
        this.poblacion = poblacion;
    }

    public String[] getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String[] gentilicio) {
        this.gentilicio = gentilicio;
    }

    public int[] getEscudos() {
        return escudos;
    }

    public void setEscudos(int[] escudos) {
        this.escudos = escudos;
    }
}

