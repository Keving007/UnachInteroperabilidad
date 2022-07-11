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
public class Usuario {
 int idusuario;
String nombreusuario;
String contrasena; 
String nombre; 
 String apellido;
 String  estado;
 public Usuario() {
 }
 public Usuario(int idusuario, String nombreusuario, String contrasena, String nombre, String apellido, String estado) {
 this.idusuario = idusuario;
 this.nombreusuario= nombreusuario;
 this.contrasena = contrasena;
 this.nombre = nombre;
 this.apellido = apellido;
 this.estado = estado;
 }
 public int getId() {
 return idusuario;
 }
 public void setId(int idusuario) {
 this.idusuario = idusuario;
 }
 public String getNombreUsuario() {
 return nombreusuario;
 }
 public void setNombreUsuario(String nombreusuario) {
 this.nombreusuario = nombreusuario;
 }
 public String getContra() {
 return contrasena;
 }
 public void setContra(String contrasena) {
 this.contrasena = contrasena;
 }
 public String getNombre() {
 return nombre;
 }
 public void setNombre(String nombre) {
 this.nombre = nombre;
 }
 public String getApellido() {
 return apellido;
 }
 public void setApellido(String apellido) {
 this.apellido = apellido;
 }
 public String getEstado() {
 return estado;
 }
 public void setEstado(String estado) {
 this.estado = estado;
 }

}