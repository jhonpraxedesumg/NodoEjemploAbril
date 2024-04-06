package org.example.lista;

public class Nodo {
    int dato;
    Nodo enlace;
    public Nodo (int x){
        dato = x;
        enlace= null;
    }

    public  Nodo (int x, Nodo n){
        dato= x;
        enlace=n;
    }
    public Nodo getEnlace(){
        return enlace;
    }
    public void setEnlace(Nodo n){
        enlace= n;
    }
    @Override
    public String toString(){
        return "Nodo("+
                "dato="+ dato +
                ",enlace="+enlace+
                '}';
    }
}
