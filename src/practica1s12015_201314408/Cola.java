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
  class NodoC {
        Planta p;
        NodoC sig;
    }
    
    private NodoC raiz,fondo;
    
    public Cola() {
        raiz=null;
        fondo=null;
    }
    
    boolean vacia (){
        if (raiz == null)
            return true;
        else
            return false;
    }

    void insertar (Planta info)
    {
        NodoC nuevo;
        nuevo = new NodoC();
        nuevo.p = info;
        nuevo.sig = null;
        if (vacia ()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

   Planta extraer ()
    {
        if (!vacia ())
        {
            Planta informacion = raiz.p;
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
        NodoC reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            reco=reco.sig;
        }
        System.out.println();
    }
}
