/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KEVIN GUAYLLA
 */
public class UsuarioDAO {
  PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex=new Conexion();
    int res;
    String msg;
    Usuario c=new Usuario();

    
    public List listar() {
        List<Usuario> datos=new ArrayList<>();
        String sql="select * from usuario";
        try {
        con = conex.getConnection();
        ps=(PreparedStatement) con.prepareStatement(sql);
        rs=ps.executeQuery();
        while (rs.next()) {
    Usuario c= new Usuario();
    c.setId(rs.getInt("idusuario"));
    c.setNombreUsuario(rs.getString("nombreusuario"));
    c.setContra(rs.getString("contrasena"));
    c.setNombre(rs.getString("nombre"));
    c.setApellido(rs.getString("apellido"));
    c.setEstado(rs.getString("estado"));
    datos.add(c);
 }

 } catch (Exception e) {
 }
 return datos;
 }
    
    public List listarN(){
        List < Usuario > datos = new ArrayList < > ();
        String sql = "select * from usuario";
        try {
             con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
             Usuario c = new Usuario();
                c.setId(rs.getInt("idusuario"));
                c.setNombre(rs.getString("nombreusuario"));
                c.setContra(rs.getString("contrasena"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getString("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    
        
        
    }

 public Usuario listarID(int idusuario) {
 String sql="select * from usuario where idusuario="+idusuario;
 try {
 con = conex.getConnection();
 ps=(PreparedStatement) con.prepareStatement(sql);
 rs=ps.executeQuery();
 while (rs.next()) {
 c.setId(rs.getInt("idusuario"));
 c.setNombreUsuario(rs.getString("nombreusuario"));
 c.setContra(rs.getString("contrasena"));
 c.setNombre(rs.getString("nombre"));
 c.setApellido(rs.getString("apellido"));
 c.setEstado(rs.getString("estado"));
 }
 }
 catch (Exception e) {
 e.printStackTrace();
 }
 return c;
 }

 public Usuario listarN(String idusuario) {
    String sql = "select * from usuario where nombreUsuario=?";
    try {
       con=conex.getConnection();
        ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1,idusuario);
        rs = ps.executeQuery();
        while (rs.next()) {
                c.setId(rs.getInt("idusuario"));
                c.setNombre(rs.getString("nombreusuario"));
                c.setContra(rs.getString("contrasena"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getString("estado"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return c;
}
 
 public String add(String nombreusuario, String contrasena, String nombre, String apellido, String estado) {
 String sql="insert into usuario(nombreusuario, contrasena,nombre,apellido,estado) values(?,?,?,?,?)";
 try {
 con=conex.getConnection();
 ps=con.prepareStatement(sql);
 ps.setString(1,nombreusuario);
 ps.setString(2,contrasena);
 ps.setString(3,nombre);
 ps.setString(4,apellido);
 ps.setString(5,estado);
 res=ps.executeUpdate();
 if (res==1){
 msg="Usuario Agregado";
 }else {
 msg="Usuario no fue Agregado";
 }
 } catch (Exception e) {
 //e.println("Error"+e.getMessage());
 e.printStackTrace();
 }
 return msg;
 }

 public String edit(int idusuario, String nombreusuario, String contrasena, String nombre, String apellido, String estado) {
 String sql="update usuario set nombreusuario=?,contrasena=?,nombre=?,apellido=?,estado=? where idusuario="+idusuario;

 try {
 con=conex.getConnection();
 ps=con.prepareStatement(sql);
 ps.setString(1,nombreusuario);
 ps.setString(2,contrasena);
 ps.setString(3,nombre);
 ps.setString(4,apellido);
 ps.setString(5,estado);
 res=ps.executeUpdate();
 if (res==1){
 msg="Usuario Actualizado";
 }else {
 msg="Usuario no Actualizado";
 }
 } catch (Exception e) {
 e.printStackTrace();
 }

 return msg;
 }

 public Usuario delete(int idusuario) {
 String sql="delete from usuario where idusuario="+idusuario;
 try {
 con=conex.getConnection();
 ps=con.prepareStatement(sql);
 res=ps.executeUpdate();
 } catch (Exception e) {
 }
 return c;
 }
}
