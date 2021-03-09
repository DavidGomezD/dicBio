package com.davidgd.buscador;

public class Usuario {

    String palabra;
    String def;

    //Generacion del constructor
    public Usuario(String palabra, String def) {
        this.palabra = palabra;
        this.def = def;
    }


    //Generacion del getter y setter
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}
