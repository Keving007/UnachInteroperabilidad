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
public class UsuarioRolDAO {
   PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String msg;
    UsuarioRol r = new UsuarioRol();

    public List listarUsuariorol() {
        List<UsuarioRol> datos = new ArrayList<>();
        String sql = "select * from usuariorol";
        try {
           con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol r = new UsuarioRol();
                r.setIdusuariorol(rs.getInt("idusuariorol"));
                r.setIdusuario(rs.getInt("idusuario"));
                r.setIdrol(rs.getInt("idrol"));
                r.setEstado(rs.getInt("estado"));
                datos.add(r);
            }
        } catch (Exception e) {
        }
        return datos;
    }

    
    
    
    
    
    
    public List ListarIDusuariorol() {
        List<UsuarioRol> datos = new ArrayList<>();
        String sql = "select * from usuariorol";
        try {
            con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol r = new UsuarioRol();
                r.setIdusuariorol(rs.getInt("idusuariorol"));
                r.setIdusuario(rs.getInt("idusuario"));
                r.setIdrol(rs.getInt("idrol"));
                r.setEstado(rs.getInt("estado"));
                datos.add(r);
            }
        } catch (Exception e) {
        }
        return datos;
    }

    public List addusuariorol() {
        List<UsuarioRol> datos = new ArrayList<>();
        String sql = "select * from usuariorol ";
        try {
            con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol r = new UsuarioRol();
                r.setIdusuariorol(rs.getInt("idusuariorol"));
                r.setIdusuario(rs.getInt("idusuario"));
                r.setIdrol(rs.getInt("idrol"));
                r.setEstado(rs.getInt("estado"));
                datos.add(r);

            }
        } catch (Exception e) {
        }
        return datos;
    }

    public List editusuariorol() {
        List<UsuarioRol> datos = new ArrayList<>();
        String sql = "select * from usuariorol";
        try {
            con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
               UsuarioRol r = new UsuarioRol();
                r.setIdusuariorol(rs.getInt("idusuariorol"));
                r.setIdusuario(rs.getInt("idusuario"));
                r.setIdrol(rs.getInt("idrol"));
                r.setEstado(rs.getInt("estado"));
                datos.add(r);

            }
        } catch (Exception e) {
        }
        return datos;
    }

    public List deleteusuariorol() {
        List<UsuarioRol> datos = new ArrayList<>();
        String sql = "select * from usuariorol";
        try {
            con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol r = new UsuarioRol();
                r.setIdusuariorol(rs.getInt("idusuariorol"));
                r.setIdusuario(rs.getInt("idusuario"));
                r.setIdrol(rs.getInt("idrol"));
                r.setEstado(rs.getInt("estado"));
                datos.add(r);

            }
        } catch (Exception e) {
        }
        return datos;
    }
//?
    public UsuarioRol listarIDusuariorol(int idusuariorol) {
        String sql = "select * from usuariorol where idusuariorol=" + idusuariorol;
        try {
            con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                r.setIdusuariorol(rs.getInt("idusuariorol"));
                r.setIdusuario(rs.getInt("idusuario"));
                r.setIdrol(rs.getInt("idrol"));
                r.setEstado(rs.getInt("estado"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }

    public String addusuariorol(int idusuario,int idrol ,int estado) {
        String sql = "insert into usuariorol (idusuario,idrol,estado) values(?,?,?)";
        try {
           con=conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ps.setInt(2, idrol);
            ps.setInt(3, estado);
            res = ps.executeUpdate();
            if (res == 1) {
                msg = "Rol Agregado";
            } else {
                msg = "Rol no fue Agregado";
            }
        } catch (Exception e) {
            //e.println("Error"+e.getMessage());
            e.printStackTrace();

        }
        return msg;

    }

    public String editusuariorol(int idusuariorol,int idusuario,int idrol, int estado) {
        String sql = "update usuariorol set idusuario=?,idrol=?,estado=? where idusuariorol=" + idusuariorol;
        try {
            con=conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idusuario);
            ps.setInt(2, idrol);
            ps.setInt(3, estado);
            res = ps.executeUpdate();
            if (res == 1) {
                msg = "Rol Actualizado";

            } else {
                msg = "Rol no Actualizado";

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return msg;
    }

    public UsuarioRol deleteusuariorol(int idusuariorol) {
        String sql = "delete from usuariorol where idusuariorol=" + idusuariorol;
        try {
            con=conex.getConnection();
            ps = con.prepareStatement(sql);
            res = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    
        public List listarUsurarioRol(){
        List <lista> datos = new ArrayList < > ();
        String sql = "select usuariorol.idusuariorol,usuario.nombreusuario,rol.descripcionrol,usuariorol.estado "
    + "from usuariorol INNER JOIN usuario ON usuario.idusuario = usuariorol.idusuario INNER JOIN rol ON rol.idrol = usuariorol.idrol;";
        try {
            con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                lista c = new lista();
                c.setIdusuariorol(rs.getInt("idusuariorol"));
                c.setNombreusuario(rs.getString("nombreusuario"));
                c.setDescripcionrol(rs.getString("descripcionrol"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
     }
        
        public List listarUsuario(){
        List < Usuario > datos = new ArrayList < > ();
        String sql = "select * from usuario";
        try {
            con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario c = new Usuario();
                c.setId(rs.getInt("idusuario"));
                c.setNombreUsuario(rs.getString("nombreusuario"));
                c.setContra(rs.getString("contrasena"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getString("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
     }
        
      public List listarrol() {
        List<Rol> datos = new ArrayList<>();
        String sql = "select * from rol";
        try {
            con=conex.getConnection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Rol r = new Rol();
                r.setidrol(rs.getInt("idrol"));
                r.setdescripcionrol(rs.getString("descripcionrol"));
                r.setnivel(rs.getString("nivel"));
                r.setEstado(rs.getString("estado"));
                datos.add(r);
            }
        } catch (Exception e) {
        }
        return datos;
    }
}