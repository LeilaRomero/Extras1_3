/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_3;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Extras1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
                
            System.out.println("Introducir numero de tres cifras:");
            int numero= leer.nextInt() , primerNumero=numero/100 , total=numero-(primerNumero*100),
                         segundoNumero=total/10 , tercerNumero=total-(segundoNumero*10);
            System.out.println("El primer numero es:"+ primerNumero +"\n segundo numero"+ 
                    segundoNumero +"\n tercer numero" +tercerNumero);
    }
    
}
