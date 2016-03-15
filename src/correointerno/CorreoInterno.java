/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correointerno;

/**
 *
 * @author MotherFoquita
 */
public class CorreoInterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Utils util = new Utils();
        Usuarios user = new Usuarios();
        Correos correo = new Correos();
        String nuser;
        int opcion, salir=0;
        
        //Volcamos usuarios de prueba y los correos de prueba
        user.volcarusuarios();
        correo.volcarcorreos();
        
        int autenticado = 0;
        util.imprime("Bienvenido al correo interno");
        
        do {
        util.imprime("Introduce tu nombre de usuario");
        nuser = util.qstring();
        util.imprime("Introduce tu password");
        String npass = util.qstring();
        autenticado = user.comprueba(nuser,npass);
        if (autenticado == 0) { util.imprime("Error de credenciales, vuelve a probar"); }
        } while (autenticado == 0);
        
        util.menu(nuser);
        
        util.imprime("Elige tu opcion");
        int Opcion = util.qint();
        switch (Opcion){
            case 1:
               util.imprime("Tienes los siguientes correos "+nuser);
               correo.ver(nuser);
               break;
            case 2:
               
                break;
            case 3:
                util.imprime("Escribe los datos para enviar el correo");
                correo.enviar(nuser);
                break;
            case 4:
                
                break;
            case 0:
                salir = 1;
                util.imprime("Gracias por usar el correo interno.\nAdios!");
                break;
            default:     
                util.imprime("No es una opcion valida, vuelve a probar");
                break;    
        
        
        
    }
    
}
}
