/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c15;

/**
 *
 * @author dmorenoar
 */
public class Heroe {
    private String nombre = "Unkwon";
    private static String poder = "Volar";
    private int numero = 11;
    private static int contador = 0;
    private String[] superPoderes = new String[]{"Volar", "Saltar","Rayos"};
    
    public Heroe(){ contador++; }
    
    public Heroe(String nombre) {
        this.nombre = nombre;
        contador++;
    }
    
    public Heroe(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        contador++;
    }

    public String getNombre() {
        return nombre;
    }

   
    public static String getPoder() {
        return poder;
    }
    
    //Método de la instancia(objeto)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Método de la clase y el atributo poder sera compartido por todos
    public static void setPoder(String poder) {
        Heroe.poder = poder;
    }

    /*Class ->Heroe
            //Métodos y sus atributos(pertenecen a la clase)
           Objeto -> Spiderman
                   //Métodos y sus atributos(son comunes para todos los objetos)
    */

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getContador() {
        return contador;
    }

    public String[] getSuperPoderes() {
        return superPoderes;
    }

    public void setSuperPoderes(String[] superPoderes) {
        this.superPoderes = superPoderes;
    }

    public String getPoder(int pos){
        return this.superPoderes[pos];
    }
    
}
