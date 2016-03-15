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
        // Creamos objetos y variables que usaremos a lo largo de la aplicacion
        Utils util = new Utils();
        Usuarios user = new Usuarios();
        Correos correo = new Correos();
        String nuser;
        int opcion, salir=1;
        
        //Volcamos usuarios de prueba y los correos de prueba
        user.volcarusuarios();
        correo.volcarcorreos();
        
        //Mensaje de bienvenida para la aplicacion
        int autenticado = 0;
        util.imprime("Bienvenido al correo interno");
        
        //Comprobamos que el usuario tenga cuenta de correo y pueda acceder
        do {
        util.imprime("Introduce tu nombre de usuario");
        nuser = util.qstring();
        util.imprime("Introduce tu password");
        String npass = util.qstring();
        autenticado = user.comprueba(nuser,npass);
        if (autenticado == 0) { util.imprime("@@@ Error de credenciales, vuelve a probar @@@"); }
        } while (autenticado == 0);
        
        //Mostramos el menu para el usuario
        do {
        util.menu(nuser);
        
        int Opcion = util.qint();
        switch (Opcion){
            case 1:
               util.imprime("Tienes los siguientes correos "+nuser);
               correo.ver(nuser);
               salir = util.smenu();
               break;
            case 2:
               correo.borrar(nuser);
               salir = util.smenu();
                break;
            case 3:
                util.imprime("Escribe los datos para enviar el correo");
                  int enviar = 0;
                    do {
                    util.imprime("A quien se lo quieres enviar?");
                    String ureceptor = util.qstring();
                    util.imprime("Escribe el titulo del correo");
                    String titulo = util.qstring();
                    util.imprime("Cual es el texto del email?");
                    String texto = util.qstring();
                    enviar = user.cuserenv(ureceptor);
                    if (enviar == 0) { util.imprime("@@@ El receptor del correo no existe @@@"); } else { correo.agregar(ureceptor,nuser,titulo,texto); }
                    } while (enviar==0);
                    salir = util.smenu();
                break;
            case 4:
                if (user.compruebaAdmin(nuser) == 0) { util.imprime("No tienes permisos gestionar usuarios"); } else { }
                break;
            case 0:
                salir = 0;
                util.imprime("Gracias por usar el correo interno.\nAdios!");
                break;
            default:     
                util.imprime("No es una opcion valida, vuelve a probar");
                break;
        }
        } while (salir == 1);
    
}
}
