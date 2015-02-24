/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201314408;

import java.util.ArrayList;

/**
 *
 * @author Erick
 */
public class Matriz {
    public int column; 
    public int fil; 
    public NodoMatriz inicio;
    public ArrayList<ListaM> columnas;
    
    public Matriz(int c, int f){
        column =c;
        fil = f; 
        inicio = new NodoMatriz();
        columnas = new ArrayList<>();
    }
    
    public void crear(){
        for(int i = 0; i<=column;i++){
            ListaM aux = new ListaM();
            columnas.add(aux);
        }
    }
    
}
