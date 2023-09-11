package com.mycompany.holamundo;

import java.util.*;

/**
 *
 * @author jedid
 */
public class Holamundo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //declaracion de arrays
        String nombre[] = new String[3];
        String sexo[] = new String[3];
        int edad[] = new int[3];

        //llenar arrays
        for (int i = 0; i <= nombre.length -1; i++) {
            System.out.println("nombre " + (i + 1) + ": ");
            nombre[i] = sc.nextLine();
        }

        for (int i = 0; i <= sexo.length -1; i++) {
            System.out.println("sexo " + nombre[i] + ": ");
            sexo[i] = sc.nextLine();
        }
        
        for (int i = 0; i <= edad.length -1; i++) {
            System.out.println("edad " + nombre[i] + ": ");
            edad[i] = sc.nextInt();
        }
        
        //validacion 1
        int promedio = 0;
        int edadViejo = 0;
        String nombreViejo = "";
        for (int i = 0; i <= edad.length -1; i++){
            promedio = promedio + edad[i];
            if (sexo[i].equals("hombre")){
                if (edad[i] > edadViejo){
                    edadViejo = edad[i];
                    nombreViejo = nombre[i];
                }
            }
        }
        
        promedio = promedio/edad.length;
        System.out.println("promedio edades: " + promedio);
        
        //validacion 2
        int contador = 0;
        for (int i = 0; i <= edad.length -1; i++){
            if (sexo[i].equals("mujer") && edad[i] < promedio ){
                contador += 1;
            }
        }
        
        System.out.println("mujeres con edad menor al promedio: " + contador);
        
        //validacion 3
        System.out.println("El hombre mas viejo es: " + nombreViejo);
        
        //validacion 4
        System.out.println("Nombres de las personas menores de edad:");
        for (int i = 0; i <= edad.length -1; i++){
            if  (edad[i] < 18){
                System.out.println("* " + nombre[i]);
            }
        }
    }
}


//Hola palma
