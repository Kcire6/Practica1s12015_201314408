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
    public Lista columnas;
    
    public Matriz(int c, int f){
        column =c;
        fil = f; 
        inicio = new NodoMatriz();
        columnas = new Lista();
   crear();
    }
    
    public void crear(){
        for(int i = 0; i<column;i++){
            ListaM aux = new ListaM();
            aux.columna = i;
        for(int j= 0; j<fil;j++){
            aux.AddNodo(i);
        }
       
            columnas.AddListaM(aux);
        }        
    }
    
    public void Imprimir(){
        String datos = "";
        for(int i =0; i<column;i++){
        for(int j = 0; j< fil; j++){
            datos = " " + columnas.get(i).M.columna + " " + columnas.get(i).M.get(j).fila ;
         System.out.println(datos);
        }
            }
       
    }
    
    public String buscar(int x, int y){
        String coord = null;
       
        
        return coord;
    }
    
}
