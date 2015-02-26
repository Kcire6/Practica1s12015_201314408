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
public class Jugador {
    public Lista Plantas; 
    public Lista Zombies; 
    public String nombre;
    public int cantidad = 0; 
    public Lista datos;
    
    public Jugador(){
       Plantas = new Lista();
       Zombies = new Lista(); 
       datos =  new Lista();
       nombre = null;
    }
    
}
