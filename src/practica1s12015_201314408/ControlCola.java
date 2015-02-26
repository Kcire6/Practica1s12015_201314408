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
public class ControlCola implements Runnable {
    
    public int index = 0;
    public int limite = 0; 
    public Cola Plantas;
    
    public ControlCola(){
        Plantas = new Cola();
        limite = Practica1s12015_201314408.Jugadores.get(0).J.cantidad;
    }
    
    public void push(){
       index = 0 + (int)(Math.random()*(Practica1s12015_201314408.Jugadores.get(0).J.Plantas.tamaño));
      Planta p = new Planta();
      p = Practica1s12015_201314408.Jugadores.get(0).J.Plantas.get(index).P;
      Plantas.insertar(p);
      System.out.println(p.nombre + " " + p.tipo);
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
