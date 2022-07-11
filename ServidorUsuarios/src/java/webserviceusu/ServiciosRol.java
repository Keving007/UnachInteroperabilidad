/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceusu;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Rol;
import modelo.RolDAO;

/**
 *
 * @author KEVIN GUAYLLA
 */
@WebService(serviceName = "ServiciosRol")
public class ServiciosRol {

    /**
     * This is a sample web service operation
     */
    RolDAO dao = new RolDAO();
@WebMethod(operationName = "listarrol")
        public List<Rol> listar(){
        List datos=dao.listarrol();
        return datos;
}

@WebMethod(operationName = "agregarrol") public String agregar(
        @WebParam(name = "descripcionrol") String descripcionrol,
        @WebParam(name = "nivel")String nivel, 
        @WebParam(name = "estado") String estado) {
    String datos = dao.addrol(descripcionrol,nivel, estado);
    return datos;
}
@WebMethod(operationName = "listarIDrol") public Rol listarIDrol(@WebParam(name = "idrol") int idrol) {
    Rol rol = dao.listarIDrol(idrol);
    return rol;
}
@WebMethod(operationName = "actualizarrol") public String actualizarrol(
        @WebParam(name = "idrol") int idrol, 
        @WebParam(name = "descripcionrol") String descripcionrol,
        @WebParam(name = "nivel")String nivel,  
        @WebParam(name = "estado") String estado) {
    String datos = dao.editrol(idrol,descripcionrol,nivel, estado);
    return datos;
}
@WebMethod(operationName = "Eliminarrol") public Rol Eliminarrol(@WebParam(name = "idrol") int idrol) {
    Rol r = dao.deleterol(idrol);
    return r;
}
}
