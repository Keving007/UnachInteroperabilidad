/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author KEVIN GUAYLLA
 */
public class UsuarioRol {
    int idusuariorol;
    int idusuario;
    int idrol;
    int estado;

    public UsuarioRol(){}
    
    public UsuarioRol(int idusuariorol, int idusuario, int idrol, int estado) {
        this.idusuariorol = idusuariorol;
        this.idusuario = idusuario;
        this.idrol = idrol;
        this.estado = estado;
    }

    public int getIdusuariorol() {
        return idusuariorol;
    }

    public void setIdusuariorol(int idusuariorol) {
        this.idusuariorol = idusuariorol;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
