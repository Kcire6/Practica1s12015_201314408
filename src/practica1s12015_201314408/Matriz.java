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
  //anidar();
    }
    
    public void anidar(){
        for(int i =0; i<column;i++){
        for(int j = 0; j< fil; j++){
            
        if(i == 0){
        columnas.get(i).M.get(j).R = columnas.get(1).M.get(j);
        }
        
        if(i<(column+1) && i>0){
        columnas.get(i).M.get(j).R = columnas.get(i+1).M.get(j);
        columnas.get(i).M.get(j).L = columnas.get(i-1).M.get(j);
        }
       
        }
            }        
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
    
    public void AddZombie(int x,int y, Zombie zo){
        for(int i =0; i<column;i++){
        for(int j = 0; j< fil; j++){
            if(i == x && j == y){
               columnas.get(i).M.get(j).Z = zo;
            }
        }
            }
        
    }
    
     public void AddPlanta(int x,int y, Planta zo){
        for(int i =0; i<column;i++){
        for(int j = 0; j< fil; j++){
            if(i == x && j == y){
               columnas.get(i).M.get(j).P = zo;
            }
        }
            }
        
    }
   
    
        public void DZombie(int x,int y){
        for(int i =0; i<column;i++){
        for(int j = 0; j< fil; j++){
            if(columnas.get(i).M.get(j).columna == x && columnas.get(i).M.get(j).fila == y){
               columnas.get(i).M.get(j).Z = null;
            }
        }
            }
        
    }
    
             public void DPlanta(int x,int y){
        for(int i =0; i<column;i++){
        for(int j = 0; j< fil; j++){
            if(columnas.get(i).M.get(j).columna == x && columnas.get(i).M.get(j).fila == y){
               columnas.get(i).M.get(j).P = null;
            }
        }
            }
        
    }
        
    public void Imprimir(){
        String datos = "";
        String name = "";
        for(int i =0; i<column;i++){
        for(int j = 0; j< fil; j++){
            datos =  columnas.get(i).M.columna /*+ " " + columnas.get(i).M.get(j).R.columna*/+ " " + columnas.get(i).M.get(j).fila ;
        if(columnas.get(i).M.get(j).Z != null){
            name = columnas.get(i).M.get(j).Z.nombre; 
        }
        else{
            name = "null";
        }
            System.out.println(datos + " "+ name);
        }
            }
    }
    
    public String buscar(int x, int y){
        String coord = null;
       return coord;
    }
    
}
