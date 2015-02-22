/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201314408;

/**
 *
 * @author Erick
 */
public class Lista {
    public Nodo inicio;
    public Nodo fin;
    public int tamaño;
    
    public Lista(){
        fin = new Nodo();
        inicio = new Nodo();
        tamaño = 0;
    }
    
    public void AddZombie(Zombie Z){
     inicio.pos = tamaño; 
     inicio.zoomb = Z;
     fin.sig = inicio; 
     inicio = fin; 
     fin = new Nodo();
     tamaño ++; 
    }
    
      public void AddDato(String s){
     inicio.pos = tamaño; 
     inicio.datosE = s;
     fin.sig = inicio; 
     inicio = fin; 
     fin = new Nodo();
     tamaño ++; 
    }
    
     public Nodo get(int n) {
        Nodo actual = inicio;
        Nodo buscado = new Nodo();
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
        Nodo actual = inicio;
        Nodo anterior = new Nodo();
        while (actual != null) {
            if (actual.pos == n) {
                anterior.sig = actual.sig;
                Nodo aux = anterior.sig;
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

