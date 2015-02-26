/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201314408;

import javax.swing.JTextArea;

/**
 *
 * @author Erick
 */
public class ControlPila implements Runnable {
    
    public int index = 0;
    public int limite = 0; 
    public Pila zombies;
     public String fin = "";
   
    public ControlPila(){
        zombies = new Pila();
        limite = Practica1s12015_201314408.Jugadores.get(1).J.cantidad;
    }
    
    public void push(){
     
       
      index = 0 + (int)(Math.random()*(Practica1s12015_201314408.Jugadores.get(1).J.Zombies.tamaño));
      Zombie z = new Zombie();
      z = Practica1s12015_201314408.Jugadores.get(1).J.Zombies.get(index).zoomb;
     fin = fin + "\\n" + z.nombre;
      zombies.push(z);
      System.out.println(zombies.Top().nombre + " "+ zombies.Top().tipo);
     
    }
    
    public void run(){
        while(limite>=0){
            try{
            
                push();
        	Thread.sleep(5000);
                limite--;
		}
		catch(InterruptedException ie){
			System.out.println("thread interrupted! " + ie);
		}
    }
        }
        
    
}
