/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correointerno;

import java.util.ArrayList;

/**
 *
 * @author MotherFoquita
 */
public class Correos {
    ArrayList<Email> email = new ArrayList<>();
    Utils util = new Utils();
    
    
    public void ver (String nuser){
        int contador = 1;
        for (int i=0;i<email.size();i++){
            if (nuser.equals(email.get(i).ureceptor)){
                util.imprime(contador + " - " +email.get(i).titulo);
                contador++;
            } 
            
        }
    }
    
    public void agregar(String ureceptor, String uenvia, String titulo, String contenido){
       email.add(new Email(ureceptor,uenvia,titulo,contenido));
       util.imprime("Correo enviado!");
    }
    
    
    
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
    
    
    
    
    public void volcarcorreos(){
        email.add(new Email("Aaron","Nuria","Proyecto correo 1","Correo enviado de Nuria para Aaron. Primer correo del proyecto"));
        email.add(new Email("Aaron","Nuria","Proyecto correo 2","Correo enviado de Nuria para Aaron. Segundo correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 3","Correo enviado de Aaron para Nuria. Tercer correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 4","Correo enviado de Aaron para Nuria. Cuarto correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 5","Correo enviado de Aaron para Nuria. Quinto correo del proyecto"));
    }
}
