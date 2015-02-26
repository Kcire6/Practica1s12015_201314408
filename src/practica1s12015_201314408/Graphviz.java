package practica1s12015_201314408;

/**
 *
 * @author Erick
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Graphviz  {

    static File texto;
    static String path;

    public class Nodog {

        String data;
        String nombre;
        String simbolo;
        boolean relacionado;

        public Nodog(String nombre, String simbolo) {
            this.relacionado = false;
            this.nombre = nombre;
            this.simbolo = simbolo;
            this.data = nombre + "[ label = " + "\"" + simbolo + "\"" + " ];\n";
        }
    }

    public class Relacion {

        String data;

        public Relacion(String nodoInicial, String nodoFinal) {
            this.data
                    = "\"" + nodoInicial + "\"" + " -- " + "\"" + nodoFinal + "\"" + ";\n";
        }
    }
public void doCatalogo(){
    String codigo1 = "", codigo2 = "";
        Nodog Juego = new Nodog("CATALOGO", "CATALOGO");
        codigo1 = codigo1 + Juego.data;
        Nodog P = new Nodog("P", "Plantas\\n" + Practica1s12015_201314408.Jugadores.get(0).J.nombre + "\\n" + Practica1s12015_201314408.Jugadores.get(0).J.cantidad);
        codigo1 = codigo1 + P.data;
        Nodog Z = new Nodog("Z", "Zombis\\n" + Practica1s12015_201314408.Jugadores.get(1).J.nombre + "\\n" + Practica1s12015_201314408.Jugadores.get(1).J.cantidad);
        codigo1 = codigo1 + Z.data;
        Relacion r = new Relacion("CATALOGO", "P");
        codigo2 = codigo2 + r.data;
        r = new Relacion("P", "Z");
        codigo2 = codigo2 + r.data;
 try {
            String aux = Practica1s12015_201314408.Jugadores.get(0).J.Plantas.get(0).P.nombre + "\\n"+Practica1s12015_201314408.Jugadores.get(0).J.Plantas.get(0).P.tipo ;
            codigo1 = codigo1 + new Nodog("i" + aux, aux).data;
            codigo2 = codigo2 + new Relacion("P", "i" + aux).data;
            try {
                int i = 1;
                String aux2 = Practica1s12015_201314408.Jugadores.get(0).J.Plantas.get(1).P.nombre +"\\n"+Practica1s12015_201314408.Jugadores.get(0).J.Plantas.get(1).P.tipo ;
                while (aux2 != null) {
                    codigo1 = codigo1 + new Nodog("i" + aux2, aux2).data;
                    codigo2 = codigo2 + new Relacion("i" + aux, "i" + aux2).data;
                    aux = aux2;
                    i++;
                    aux2 = Practica1s12015_201314408.Jugadores.get(0).J.Plantas.get(i).P.nombre +"\\n"+Practica1s12015_201314408.Jugadores.get(0).J.Plantas.get(i).P.tipo ;
                }
            } catch (Exception e) {
            }
            
        } catch (Exception e) {
        }
       try {
            String aux = Practica1s12015_201314408.Jugadores.get(1).J.Zombies.get(0).zoomb.nombre + "\\n"+Practica1s12015_201314408.Jugadores.get(1).J.Zombies.get(0).zoomb.tipo ;
            codigo1 = codigo1 + new Nodog("i" + aux, aux).data;
            codigo2 = codigo2 + new Relacion("Z", "i" + aux).data;
            try {
                int i = 1;
                String aux2 = Practica1s12015_201314408.Jugadores.get(1).J.Zombies.get(1).zoomb.nombre +"\\n"+Practica1s12015_201314408.Jugadores.get(1).J.Zombies.get(1).zoomb.tipo ;
                while (aux2 != null) {
                    codigo1 = codigo1 + new Nodog("i" + aux2, aux2).data;
                    codigo2 = codigo2 + new Relacion("i" + aux, "i" + aux2).data;
                    aux = aux2;
                    i++;
                    aux2 = Practica1s12015_201314408.Jugadores.get(1).J.Zombies.get(i).zoomb.nombre +"\\n"+Practica1s12015_201314408.Jugadores.get(1).J.Zombies.get(i).zoomb.tipo ;
                }
            } catch (Exception e) {
            }
         
        } catch (Exception e) {
        }
        archivoGraphviz(codigo1 + codigo2);
        generar("PERSONAJES");
}


public void doPila(Pila p){
    ArrayList<String> datos = new ArrayList<>();
    for(int k = 0;k<p.tamanioPila;k++){
        datos.add(p.pop().nombre);
    }
    
    
    String codigo1 = "", codigo2 = "";
        Nodog Juego = new Nodog("PILA", "PILA");
        codigo1 = codigo1 + Juego.data;
        Nodog P = new Nodog("P", "ZOMBIES\\n" + Practica1s12015_201314408.Jugadores.get(0).J.nombre + "\\n" + Practica1s12015_201314408.Jugadores.get(0).J.cantidad);
        codigo1 = codigo1 + P.data;
        Relacion r = new Relacion("PILA", "P");
        codigo2 = codigo2 + r.data;
        
 try {
            String aux = datos.get(0);
            codigo1 = codigo1 + new Nodog("i" + aux, aux).data;
            codigo2 = codigo2 + new Relacion("P", "i" + aux).data;
            try {
                int i = 1;
                String aux2 = datos.get(1);
                while (aux2 != null) {
                    codigo1 = codigo1 + new Nodog("i" + aux2, aux2).data;
                    codigo2 = codigo2 + new Relacion("i" + aux, "i" + aux2).data;
                    aux = aux2;
                    i++;
                    aux2 = datos.get(i);
                }
            } catch (Exception e) {
            }
            
        } catch (Exception e) {
        }
       
        archivoGraphviz(codigo1 + codigo2);
        generar("PILA");
    
    
    
}    

public void doCola(Cola c){
    
}

    public void doUsuarios() {
        String codigo1 = "", codigo2 = "";
        Nodog Juego = new Nodog("Juego", "Juego");
        codigo1 = codigo1 + Juego.data;
        Nodog P = new Nodog("P", "Plantas\\n" + Practica1s12015_201314408.Jugadores.get(0).J.nombre + "\\n" + Practica1s12015_201314408.Jugadores.get(0).J.cantidad);
        codigo1 = codigo1 + P.data;
        Nodog Z = new Nodog("Z", "Zombis\\n" + Practica1s12015_201314408.Jugadores.get(1).J.nombre + "\\n" + Practica1s12015_201314408.Jugadores.get(1).J.cantidad);
        codigo1 = codigo1 + Z.data;
        Relacion r = new Relacion("Juego", "P");
        codigo2 = codigo2 + r.data;
        r = new Relacion("P", "Z");
        codigo2 = codigo2 + r.data;
       try {
            String aux = Practica1s12015_201314408.Jugadores.get(0).J.datos.get(0).datosE;
            codigo1 = codigo1 + new Nodog("i" + aux, aux).data;
            codigo2 = codigo2 + new Relacion("P", "i" + aux).data;
            try {
                int i = 1;
                String aux2 = Practica1s12015_201314408.Jugadores.get(0).J.datos.get(1).datosE;
                while (aux2 != null) {
                    codigo1 = codigo1 + new Nodog("i" + aux2, aux2).data;
                    codigo2 = codigo2 + new Relacion("i" + aux, "i" + aux2).data;
                    aux = aux2;
                    i++;
                    aux2 = Practica1s12015_201314408.Jugadores.get(0).J.datos.get(i).datosE;
                }
            } catch (Exception e) {
            }
            
        } catch (Exception e) {
        }
       try {
            String aux = Practica1s12015_201314408.Jugadores.get(1).J.datos.get(0).datosE;
            codigo1 = codigo1 + new Nodog("i" + aux, aux).data;
            codigo2 = codigo2 + new Relacion("Z", "i" + aux).data;
            try {
                int i = 1;
                String aux2 = Practica1s12015_201314408.Jugadores.get(1).J.datos.get(1).datosE;
                while (aux2 != null) {
                    codigo1 = codigo1 + new Nodog("i" + aux2, aux2).data;
                    codigo2 = codigo2 + new Relacion("i" + aux, "i" + aux2).data;
                    aux = aux2;
                    i++;
                    aux2 = Practica1s12015_201314408.Jugadores.get(1).J.datos.get(i).datosE ;
                }
            } catch (Exception e) {
            }
         
        } catch (Exception e) {
        }
        archivoGraphviz(codigo1 + codigo2);
        generar("USUARIOS");
    }

   public void doZombis(Pila p) {
       Pila temp = p;
        String codigo1 = "", codigo2 = "";
        codigo1 = codigo1 + new Nodog("Z", "ZOMBIS EN \\nPILA").data;
        if (p.tamanioPila >0) {
           Zombie aux = temp.pop();
            codigo1 = codigo1 + new Nodog(aux.nombre + "i", aux.nombre).data;
            codigo2 = codigo2 + new Relacion("Z", aux.nombre + "i").data;
            while (aux != null) {
                try {
                  
                    codigo1 = codigo1 + new Nodog(aux.nombre + "i", temp.Top().nombre).data;
                    codigo2 = codigo2 + new Relacion(aux.nombre + "i", temp.Top().nombre + "i").data;
                } catch (Exception e) {
                }
                  aux = temp.pop();
            }
        }
        archivoGraphviz(codigo1 + codigo2);
        generar("zombis");
    }

   /* public void doPlantas(Cola c) {
        String codigo1 = "", codigo2 = "";
        codigo1 = codigo1 + new Nodo("Z", "PLANTAS EN \\nCOLA").data;
        if (!c.isEmpty()) {
            nodoCola aux = c.first;
            codigo1 = codigo1 + new Nodo(aux.planta.nombre + "i", aux.planta.nombre).data;
            codigo2 = codigo2 + new Relacion("P", aux.planta.nombre + "i").data;
            while (aux != null) {
                try {
                    codigo1 = codigo1 + new Nodo(aux.sig.planta.nombre + "i", aux.sig.planta.nombre).data;
                    codigo2 = codigo2 + new Relacion(aux.planta.nombre + "i", aux.sig.planta.nombre + "i").data;
                } catch (Exception e) {
                }
                aux = aux.sig;
            }
        }
        archivoGraphviz(codigo1 + codigo2);
        generar("plantas");
    }*/

    public void doMatriz() {
        String codigo1 = "", codigo2 = "";
        archivoGraphviz(codigo1 + codigo2);
        generar("tablero");
    }

    public void archivoGraphviz(String codigo1) {
        try {
            path = "C:\\Users\\Erick\\Desktop\\data.txt";
            Graphviz.texto = new File(path);
            FileWriter writer = new FileWriter(texto);
            BufferedWriter buf = new BufferedWriter(writer);
            buf.write(
                    "graph G {\n"
                    + "node [shape = circle];"
                    + codigo1
                    + "}"
            );
            buf.flush();
            buf.close();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void generar(String nombre) {
        try {
            String dotPath = "dot";
            String fileInputPath = "C:\\Users\\Erick\\Desktop\\data.txt";
            String fileOutputPath = "C:\\Users\\Erick\\Desktop\\" + nombre + ".png";
            String tParam = "-Tpng";
            String tOParam = "-o";
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();
            rt.exec(cmd);

        } catch (Exception ex) {
        }
    }

}
