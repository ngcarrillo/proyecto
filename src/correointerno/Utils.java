/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correointerno;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Utils {
    
    public void imprime(String texto){
        System.out.println(texto);
    }
 
    public String qstring(){
         Scanner respuestaTeclado = new Scanner(System.in);
         String respuesta = respuestaTeclado.nextLine();
         return respuesta;
    }
     
    public int qint(){
         Scanner respuestaTeclado = new Scanner(System.in);
         int respuesta = respuestaTeclado.nextInt();
         return respuesta;
    }
    
    public void menu(String nuser){
        imprime("Hola "+nuser +", elige que quieres hacer\n  Ver tus correos (Opcion 1)\n  Borrar un correo (Opcion 2)\n  Enviar un correo (Opcion 3)\n  Salir del programa(Opcion 0)\nElige la opcion que quieres");
    }
     
}