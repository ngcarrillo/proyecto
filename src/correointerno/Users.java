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
public class Users {
    String nombre, password;
    int permisos;
    Users(String nombre, String password, int permisos){
        this.nombre = nombre;
        this.password = password;
        this.permisos = permisos;
        }
}
