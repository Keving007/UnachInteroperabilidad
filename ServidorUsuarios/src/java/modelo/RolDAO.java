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
public class RolDAO {
  PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String msg;
    Rol r = new Rol();

    public List listarrol() {
        List<Rol> datos = new ArrayList<>();
        String sql = "select * from rol";
        try {
            con = conex.getConnection();
        ps=(PreparedStatement) con.prepareStatement(sql);
        rs=ps.executeQuery();
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

    public List ListarIDrol() {
        List<Rol> datos = new ArrayList<>();
        String sql = "select * from rol";
        try {
            con = conex.getConnection();
        ps=(PreparedStatement) con.prepareStatement(sql);
        rs=ps.executeQuery();
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

    public List addrol() {
        List<Rol> datos = new ArrayList<>();
        String sql = "select * from rol ";
        try {
            con = conex.getConnection();
        ps=(PreparedStatement) con.prepareStatement(sql);
        rs=ps.executeQuery();
            while (rs.next()) {
                Rol r = new Rol();
                r. setidrol(rs.getInt("idrol"));
                r.setdescripcionrol(rs.getString("descripcionrol"));
                r.setnivel(rs.getString("nivel"));
                r.setEstado(rs.getString("estado"));
                datos.add(r);

            }
        } catch (Exception e) {
        }
        return datos;
    }

    public List editrol() {
        List<Rol> datos = new ArrayList<>();
        String sql = "select * from rol";
        try {
            con = conex.getConnection();
        ps=(PreparedStatement) con.prepareStatement(sql);
        rs=ps.executeQuery();
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

    public List deleterol() {
        List<Rol> datos = new ArrayList<>();
        String sql = "select * from rol";
        try {
            con = conex.getConnection();
        ps=(PreparedStatement) con.prepareStatement(sql);
        rs=ps.executeQuery();
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
//?
    public Rol listarIDrol(int idrol) {
        String sql = "select * from rol where idrol=" + idrol;
        try {
            con = conex.getConnection();
        ps=(PreparedStatement) con.prepareStatement(sql);
        rs=ps.executeQuery();
            while (rs.next()) {

                r.setidrol(rs.getInt("idrol"));
                r.setdescripcionrol(rs.getString("descripcionrol"));
                r.setnivel(rs.getString("nivel"));
                r.setEstado(rs.getString("estado"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }

    public String addrol(String descripcionrol, String nivel, String estado) {
        String sql = "insert into rol (descripcionrol,nivel,estado) values(?,?,?)";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, descripcionrol);
            ps.setString(2, nivel);
            ps.setString(3, estado);
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

    public String editrol(int idrol, String descripcionrol, String nivel, String estado) {
        String sql = "update rol set descripcionrol=?,nivel=?,estado=? where idrol=" + idrol;
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, descripcionrol);
            ps.setString(2, nivel);
            ps.setString(3, estado);
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

    public Rol deleterol(int idrol) {
        String sql = "delete from rol where idrol=" + idrol;
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            res = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
