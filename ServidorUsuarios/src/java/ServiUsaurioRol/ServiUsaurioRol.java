/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiUsaurioRol;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Rol;
import modelo.Usuario;
import modelo.UsuarioRol;
import modelo.UsuarioRolDAO;
import modelo.lista;

/**
 *
 * @author KEVIN GUAYLLA
 */
@WebService(serviceName = "ServiUsaurioRol")
public class ServiUsaurioRol {

  UsuarioRolDAO dao = new UsuarioRolDAO();
@WebMethod(operationName = "listarusuariorol")
        public List<UsuarioRol> listar(){
        List datos=dao.ListarIDusuariorol();
        return datos;
}

@WebMethod(operationName = "agregarusuariorol") 
public String agregar(@WebParam(name = "idusuario") int idusuario,
        @WebParam(name = "idrol")int idrol, 
        @WebParam(name = "estado") int estado) {
    String datos = dao.addusuariorol(idusuario,idrol, estado);
    return datos;
}
@WebMethod(operationName = "listarIDusuariorol") public UsuarioRol listarIDusuariorol(@WebParam(name = "idusuariorol") int idusuariorol) {
    UsuarioRol usuariorol = dao.listarIDusuariorol(idusuariorol);
    return usuariorol;
}
@WebMethod(operationName = "actualizarusuariorol") public String actualizarusuariorol(
        @WebParam(name = "idusuariorol") int idusuariorol, 
        @WebParam(name = "idusuario") int idusuario,
        @WebParam(name = "idrol")int idrol,  
        @WebParam(name = "estado") int estado) {
    String datos = dao.editusuariorol(idusuariorol,idusuario,idrol, estado);
    return datos;
}
@WebMethod(operationName = "Eliminarusuariorol") public UsuarioRol Eliminarusuariorol(@WebParam(name = "idusuariorol") int idusuariorol) {
    UsuarioRol r = dao.deleteusuariorol(idusuariorol);
    return r;
}
 @WebMethod(operationName = "listarNombreDescripcion")
    public List<lista> listarUsurarioRol() {
        List datos = dao.listarUsurarioRol();
        return datos;
    }
    
    @WebMethod(operationName = "listarUsuario")
    public List<Usuario> listarUsuario() {
        List datos = dao.listarUsuario();
        return datos;
    }
    @WebMethod(operationName = "listarrol")
        public List<Rol> listarrol(){
        List datos=dao.listarrol();
        return datos;
}
}
