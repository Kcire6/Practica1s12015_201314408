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
public class ListaM {
    public NodoMatriz inicio;
    public NodoMatriz fin;
    public int tamaño, columna;
    
    public ListaM(){
        fin = new NodoMatriz();
        inicio = new NodoMatriz();
        columna = 0;
        tamaño = 0;
    }
    
    public void AddNodo(int g){
     inicio.fila = tamaño; 
     fin.Down = inicio; 
     inicio.columna = g; 
     inicio = fin; 
     fin = new NodoMatriz();
     tamaño ++; 
    }
         
     public NodoMatriz get(int n) {
        NodoMatriz actual = inicio;
        NodoMatriz buscado = new NodoMatriz();
        while (actual != null) {
            if (actual.Down.fila == n) {
                buscado = actual.Down;
                actual = null;
            } else {
                actual = actual.Down;
            }
        }

        return buscado;
    }

    public void remove(int n) {
        NodoMatriz actual = inicio;
        NodoMatriz anterior = new NodoMatriz();
        while (actual != null) {
            if (actual.fila == n) {
                anterior.Down = actual.Down;
                NodoMatriz aux = anterior.Down;
                while (aux != null) {
                    aux.fila--;
                    aux = aux.Down;
                }
                tamaño--;
                actual = null;
            } else {
                anterior = actual;
                actual = actual.Down;
            }
        }

    }
}
