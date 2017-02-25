/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.rbaezm.a07;
import java.util.Scanner;
/**
 *
 * @author Ruben Daniel Baez Muñiz A01411504 IMT
 */
public class SPPRBaezMA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        int num;
        String [] telefono = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println ("Introduce el número de telefono " + i);
            telefono[i] = kb.nextLine();
        }
        System.out.println("Porfavor introduzca que numero quiere");
        num = kb.nextInt();
        if (num  < telefono.length){
        System.out.println("El número solicitado es " + telefono[num]);
        } else System.out.println("El número ingresado está fuera del rango permitido.");
    }
    
        
    }
    

