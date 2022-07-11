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
public class lista {
    
   int idusuariorol;
    String nombreusuario;
    String descripcionrol;
    int estado;
    int idusuario;
    int idrol;

    public lista(){}
    public lista (int idusuariorol,String nombreusuario,String descripcionrol,int estado,int idusuario, int idrol){
        this.idusuariorol = idusuariorol;
        this.nombreusuario = nombreusuario;
        this.descripcionrol = descripcionrol;
        this.estado = estado;
        this.idusuario=idusuario;
        this.idrol=idrol;
    }
     public int getIdusuariorol() {
        return idusuariorol;
    }
    public void setIdusuariorol(int idusuariorol) {
        this.idusuariorol = idusuariorol;
    }
    public String getNombreusuario() {
        return nombreusuario;
    }
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
        public String getDescripcionrol() {
        return descripcionrol;
    }
    public void setDescripcionrol(String descripcionrol) {
        this.descripcionrol = descripcionrol;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
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
}