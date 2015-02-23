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
public class Cola {
  class Nodo {
        Zombie z;
        Nodo sig;
    }
    
    private Nodo raiz,fondo;
    
    Cola() {
        raiz=null;
        fondo=null;
    }
    
    boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar (Zombie info)
    {
        Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.z = info;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

   Zombie extraer ()
    {
        if (!vacia ())
        {
            Zombie informacion = raiz.z;
            if (raiz == fondo){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else
            return null;
    }

    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.z.pos+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
}
