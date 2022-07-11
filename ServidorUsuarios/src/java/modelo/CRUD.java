/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author KEVIN GUAYLLA
 */
public interface CRUD {
    
    public List listar();
    public Usuario listarID(int idusuario);
    public String add(String nombreusuario, String contrasena, String nombre, String direccion, String estado);
    public String edit(int idusuario, String nombreusuario, String contrasena, String nombre, String direccion, String estado);
    public Usuario delete(int idusuario);
    
      //rol
        public List listarrol();
        public Rol listarIDrol(int idrol);
        public String addrol(String descripcionrol, String nivel, String estado);
        public String editrol(int idrol, String descripcionrol, String nivel, String estado);
        public Rol deleterol(int idrol);
        
        //usuariorol
        public List listarusuariorol();
        public Rol listarIDusuariorol(int idusuariorol);
        public String addusuariorol(int idusuario,int idrol, int estado);
        public String editusuariorol(int idusuariorol, int idusuario,int idrol, int estado);
        public Rol deleteusuariorol(int idusuariorol);
     //lista
        public List listarUsuarioRol();
}
