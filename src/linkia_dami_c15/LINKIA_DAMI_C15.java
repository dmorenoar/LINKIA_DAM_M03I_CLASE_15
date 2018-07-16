/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c15;

import java.util.ArrayList;
import linkia_dami_c15.Utilidades.*;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heroe spiderman = new Heroe("Spiderman");

        Heroe batman = new Heroe("Batman", 66);

        System.out.println(spiderman.getNombre());
        System.out.println(spiderman.getNumero());

        System.out.println(batman.getNumero());

        Heroe goku = new Heroe();

        System.out.println(goku.getNombre());

        System.out.println(Heroe.getPoder());

        //Pregunto cuantos valores tengo en el contador
        System.out.println(Heroe.getContador());

        double valor = Utilidades.pideDouble("Introduce un Double");

        System.out.println(valor);

        String[] listaCont = new String[4];

        //Defini un arrayList definir el tipo
        ArrayList<String> listaContactos = new ArrayList();

        listaCont[0] = "Diana";

        /*
        for(int i = 0;i<listaCont.length;i++){
            if(listaCont[i].equals("Diana")){
                System.out.println("La posición de Diana es: " + i);
            }
        }*/
        listaContactos.add("Tomás");
        listaContactos.add("Marta");
        listaContactos.add("Martina");
        
        
        System.out.println("Tomas ocupa la posición:" + listaContactos.indexOf("Marta"));

        System.out.println("Quien hay en la pos 2: " + listaContactos.get(2));

        
        Heroe[] lista = new Heroe[3];
        
        /*DEFINO UN ARRAYLIST DE LA CLASE*/
        ArrayList<Heroe> listaHeroes = new ArrayList();
        
        listaHeroes.add(goku);
        listaHeroes.add(spiderman);
        
        System.out.println("Nombre del heroe " + listaHeroes.get(1).getNombre());
        
        System.out.println(listaHeroes.get(0).getPoder(0));
        
        /*
        ArrayList(Heroes)
            Heroe1
                getters/setters
                propiedades
                String[] poderes;
            Heroe2
                getters/setters
                propiedades
                String[] poderes;
        */
    }
}
