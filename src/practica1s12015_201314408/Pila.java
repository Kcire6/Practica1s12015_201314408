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
public class Pila {
    private Zombie[] pila;
	public int top;
	public int tamanioPila;
       
	
	public Pila(){
		tamanioPila = 1;
		top = -1;
		pila = new Zombie[tamanioPila];
	}
	
	//las operaciones basicas de la pila
	public void push(Zombie p){
		if (top == (tamanioPila -1))
			redimensionar();
		pila[++top] = p;
	}
	
	public Zombie pop(){
		if(top < 0)
			return null;
		return pila[top--];
	}
        
        	public Zombie Top(){
		if(top < 0)
			return null;
		return pila[top];
	}
	
	private void redimensionar(){
		Zombie[] temp = pila;
		tamanioPila *= 2;
		pila = new Zombie[tamanioPila];
		
		for(int i = 0; i <= top; i++)
			pila[i] = temp[i];
	}
}
