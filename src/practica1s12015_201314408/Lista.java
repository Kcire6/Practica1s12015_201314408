/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201314408;

import javax.swing.JLabel;

/**
 *
 * @author Erick
 */
public class Lista {
    public NodoL inicio;
    public NodoL fin;
    public JLabel imagen;
    public int tamaño;
    
    public Lista(){
        fin = new NodoL();
        inicio = new NodoL();
        tamaño = 0;
    }
    
    public void AddZombie(Zombie Z){
     inicio.pos = tamaño; 
     inicio.zoomb = Z;
     fin.sig = inicio; 
     inicio = fin; 
     fin = new NodoL();
     tamaño ++; 
    }
     public void AddPlanta(Planta P){
     inicio.pos = tamaño; 
     inicio.P = P;
     fin.sig = inicio; 
     inicio = fin; 
     fin = new NodoL();
     tamaño ++; 
    }
    
     public void AddPlayer(Jugador j){
     inicio.pos = tamaño; 
     inicio.J = j;
     fin.sig = inicio; 
     inicio = fin; 
     fin = new NodoL();
     tamaño ++; 
    }
    
    public void AddListaM(ListaM m){
     inicio.pos = tamaño; 
     inicio.M = m;
     fin.sig = inicio; 
     inicio = fin; 
     fin = new NodoL();
     tamaño ++; 
    }
     
     
      public void AddDato(String s){
     inicio.pos = tamaño; 
     inicio.datosE = s;
     fin.sig = inicio; 
     inicio = fin; 
     fin = new NodoL();
     tamaño ++; 
    }
      
     public NodoL get(int n) {
        NodoL actual = inicio;
        NodoL buscado = new NodoL();
        while (actual != null) {
            if (actual.sig.pos == n) {
                buscado = actual.sig;
                actual = null;
            } else {
                actual = actual.sig;
            }
        }

        return buscado;
    }

    public void remove(int n) {
        NodoL actual = inicio;
        NodoL anterior = new NodoL();
        while (actual != null) {
            if (actual.pos == n) {
                anterior.sig = actual.sig;
                NodoL aux = anterior.sig;
                while (aux != null) {
                    aux.pos--;
                    aux = aux.sig;
                }
                tamaño--;
                actual = null;
            } else {
                anterior = actual;
                actual = actual.sig;
            }
        }

    }
}

