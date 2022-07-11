/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciousuario;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 *
 * @author KEVIN GUAYLLA
 */
@WebService(serviceName = "ServiUsuario")
public class ServiUsuario {

    /**
     * This is a sample web service operation
     */
    UsuarioDAO dao = new UsuarioDAO();

    @WebMethod(operationName = "listar")
    public List<Usuario> listar() {
        List datos = dao.listar();
        return datos;
    }

    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "nombreusuario") String nombreusuario,
            @WebParam(name= "contrasena") String contrasena,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "apellido") String apellido,
            @WebParam(name = "estado") String estado) {
        String datos = dao.add(nombreusuario,contrasena,nombre,apellido, estado);
        return datos;
    }

    @WebMethod(operationName = "listarID")
    public Usuario listarID(@WebParam(name = "idusuario") int idusuario) {
        Usuario usuario = dao.listarID(idusuario);
        return usuario;
    }

    @WebMethod(operationName = "actualizar")
    public String actualizar(@WebParam(name = "idusuario") int idusuario, 
            @WebParam(name = "nombreusuario") String nombreusuario, 
            @WebParam(name = "contrasena") String contrasena,
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "apellido") String apellido,
            @WebParam(name = "estado") String estado) {
        String datos = dao.edit(idusuario, nombreusuario,contrasena,nombre,apellido, estado);
        return datos;
    }

    @WebMethod(operationName = "Eliminar")
    public Usuario Eliminar(@WebParam(name = "idusuario") int idusuario) {
        Usuario c = dao.delete(idusuario);
        return c;
        
        
    }
    @WebMethod(operationName = "listarN") public Usuario listarN(@WebParam(name = "nombreusuario") String nombreusuario) {
    Usuario usuario = dao.listarN(nombreusuario);
    return usuario;
}
}
