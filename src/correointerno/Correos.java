/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correointerno;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MotherFoquita
 */
public class Correos {
    ArrayList<Email> email = new ArrayList<>();
    Utils util = new Utils();
    
    //Se listan los correos para el usuario
    public void ver (String nuser){
        int contador = 1;
         for (int i=0;i<email.size();i++){
            if (nuser.equals(email.get(i).ureceptor)){
                util.imprime(contador + " - " +email.get(i).titulo);
                contador++;
            } 
            
        }
    }
    
    //Enviamos un correo
    public void agregar(String ureceptor, String uenvia, String titulo, String contenido){
       email.add(new Email(ureceptor,uenvia,titulo,contenido));
       util.imprime("Correo enviado!");
    }
    
    
    //Listamos los correos del usuario y los numeramos de forma que use esos numeros para borrarlos
    public void borrar(String nuser){
        int contador = 1;
        for (int i=0;i<email.size();i++){
            if (nuser.equals(email.get(i).ureceptor)){
                util.imprime(contador + " - " +email.get(i).titulo);
                contador++;
            } 
            
        }
        util.imprime("Que numero de correo quieres borrar?");
        int pregunta = util.qint();
        contador = 1;
        for (int i=0;i<email.size();i++){
            if (nuser.equals(email.get(i).ureceptor)){
                if (pregunta == contador) { email.remove(i); util.imprime("Correo borrado!");}
                contador++;
            } 
            
        }
    }
    
    
    
    //Metodo para volcar correos de prueba
    public void volcarcorreos(){
        email.add(new Email("Aaron","Nuria","Proyecto correo 1","Correo enviado de Nuria para Aaron. Primer correo del proyecto"));
        email.add(new Email("Aaron","Nuria","Proyecto correo 2","Correo enviado de Nuria para Aaron. Segundo correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 3","Correo enviado de Aaron para Nuria. Tercer correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 4","Correo enviado de Aaron para Nuria. Cuarto correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 5","Correo enviado de Aaron para Nuria. Quinto correo del proyecto"));
    }
    
    public void ficheroCorreos(){
       
         BufferedWriter bw;
           bw=null;
        try {

            bw = new BufferedWriter(new FileWriter("correo.txt"));
            for (Email email1 : email) {
                bw.write(email1.uenvia);
                bw.write(email1.ureceptor);
                bw.write(email1.titulo);
                bw.write(email1.contenido);
                bw.write("\n");
                  
            }
        } catch (IOException ex) {
            Logger.getLogger(Correos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             try {
                 bw.close();
             } catch (IOException ex) {
                 Logger.getLogger(Correos.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
}
    /**supuestamente en internet creaban un fichero desde un archivo asi
     * yo no fui capaz la verdad
     * @param archivo
     * @return 
     
   public static ArrayList cargar(File archivo)(){     
    //ObjectInputStream ficheroEntrada = null;
        ArrayList correos = null;
        try {
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream("correo.txt"));
            correos =(ArrayList) ficheroEntrada.readObject();
            ficheroEntrada.close();
            return correos;
        } catch (ClassNotFoundException | IOException cnfe) {
            return null;
        }
    }/*

}
