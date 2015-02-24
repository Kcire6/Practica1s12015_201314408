/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201314408;

import java.util.Stack;

/**
 *
 * @author Erick
 */
public class Practica1s12015_201314408 {
  
    
  public static Lista Jugadores = new Lista(); 
  public static Pila Plantas = new Pila();
  public static Cola Zombies = new Cola();
  public static ListaM pru = new ListaM();
  public static Matriz mati = new Matriz(8,5);
  
  public Practica1s12015_201314408(){
 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Menu.Start();
   
   Zombie z = new Zombie();
   z.pos = 2;
   
   Zombies.insertar(z);
   Zombies.imprimir();
   
   mati.Imprimir();
   
   
   
    
    }
    
}
