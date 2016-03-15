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
    Usuarios user = new Usuarios();
    
    public void ver (String nuser){
        for (int i=0;i<email.size();i++){
            if (nuser.equals(email.get(i).ureceptor)){
                util.imprime(email.get(i).titulo);
            } 
            
        }
    }
    
    public void enviar(String nuser){
        int enviar = 0;
        do {
        util.imprime("A quien se lo quieres enviar?");
        String ureceptor = util.qstring();
        util.imprime("Escribe el titulo del correo");
        String titulo = util.qstring();
        util.imprime("Cual es el texto del email?");
        String texto = util.qstring();
        enviar = user.cuserenv(ureceptor);
        if (enviar == 0) { util.imprime("El receptor del correo no existe"); } else { email.add(new Email(ureceptor,nuser,titulo,texto)); }
        } while (enviar==0);
    }
    
    
    
    
    
    
    
    
    public void volcarcorreos(){
        email.add(new Email("Aaron","Nuria","Proyecto correo 1","Correo enviado de Nuria para Aaron. Primer correo del proyecto"));
        email.add(new Email("Aaron","Nuria","Proyecto correo 2","Correo enviado de Nuria para Aaron. Segundo correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 3","Correo enviado de Aaron para Nuria. Tercer correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 4","Correo enviado de Aaron para Nuria. Cuarto correo del proyecto"));
        email.add(new Email("Nuria","Aaron","Proyecto correo 5","Correo enviado de Aaron para Nuria. Quinto correo del proyecto"));
    }
}
