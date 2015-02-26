/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s12015_201314408;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JLabel;

/**
 *
 * @author Erick
 */
public class Planta {
   public String nombre,tipo; 
   int ataque,defensa;
   public JLabel imagen;
   public ImageIcon ic;
   public Icon icono;
   public File fichero;
   
    public Planta(){
        ataque =0;
        defensa = 0; 
       nombre = null;
    }
    public void dibujar(JLabel ima){
        try{
           ic = new ImageIcon(fichero.toString());
           icono = new ImageIcon(ic.getImage().getScaledInstance(ima.getWidth(), ima.getHeight(), Image.SCALE_DEFAULT));
           ima.setText(null);
           ima.setIcon(icono);
       }catch(Exception ex){
           
       } 
    }
    
}
