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
public class NodoMatriz {
    public NodoMatriz Up;
    public NodoMatriz Down;
    public NodoMatriz R;
    public NodoMatriz L;
    public Lista Labels = new Lista();
    public int columna = 0;
    public int fila = 0; 
    Zombie Z;
    Planta P;
   
    public NodoMatriz(){
      Up = null;
      Down = null;
      R = null; 
      L = null; 
      Z = null; 
      P = null; 
    }
}
