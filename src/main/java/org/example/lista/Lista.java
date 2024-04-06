package org.example.lista;

import java.util.Scanner;

public class Lista {
    public Nodo primero;

    public Lista() {
        primero = null;
    }

    private int leerEntero() {

        System.out.println("ingrese valor, -1 para terminar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    public Lista crearLista() {
        int x = 0;
        primero = null;
        do {
            x = leerEntero();
            if (x != -1) {
                primero = new Nodo(x, primero);
            }
        }while (x!= -1) ;
            return this;
        }
        public Lista insertearCabezaLista(int entrada){
            Nodo nuevo;
            nuevo= new Nodo(entrada);
            nuevo.enlace=primero;
            primero=nuevo;
            return this;

        }
        public void visualizar(){
            Nodo n;
            int k = 0;
            n = primero;
            while (n!=null){
                System.out.println(n.dato);
                n = n.enlace;
                k++;
                System.out.println((k % 15!=0 ? " " : "\n"));
            }
        }
    }


