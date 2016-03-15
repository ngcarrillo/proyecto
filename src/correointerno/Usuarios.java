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
public class Usuarios {
    ArrayList<Users> users = new ArrayList<>();
    Utils util = new Utils();
    
    public int comprueba(String nuser, String npass){
      int pasa = 0;
      for (int i=0;i<users.size();i++){
          if (nuser.equals(users.get(i).nombre)) {
              util.imprime("Usuario correcto");
              if (npass.equals(users.get(i).password)){
                  util.imprime("Password correcto\nBienvenid@ al correo interno de la empresa");
                  pasa = 1;
                } 
          } 
      }
     return pasa;
    }
    
    public int cuserenv(String ureceptor){
        int valor = 0;
         for (int i=0;i<users.size();i++){
          if (ureceptor.equals(users.get(i).nombre)) {
             valor = 1; 
          }
        }
         return valor;
    }
    
    public void volcarusuarios(){
        users.add(new Users("Aaron","password"));
        users.add(new Users("Nuria","password2"));
    }
    
    
    
}
