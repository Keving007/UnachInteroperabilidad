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
public class Rol {
 int idrol;
          String descripcionrol;
          String nivel;
          String estado;

    public Rol() {}
    public Rol(int idrol,String descripcionrol,String nivel , String estado) {
        this.idrol = idrol;
        this.descripcionrol = descripcionrol;
        this.nivel = nivel;
        this.estado = estado;
    }
    public int getidrol() {
        return idrol;
    }
    public void setidrol(int idrol) {
        this.idrol = idrol;
    }
    public String getdescripcionrol() {
        return descripcionrol;
    }
    public void setdescripcionrol(String descripcionrol) {
        this.descripcionrol = descripcionrol;
    }
    
    public String getnivel() {
        return nivel;
    }
    public void setnivel(String nivel) {
        this.nivel = nivel;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    } 
}