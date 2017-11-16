
package jdbc.empleados.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmpleadosService", targetNamespace = "http://server.ws.empleados.jdbc/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmpleadosService {


    /**
     * 
     * @return
     *     returns jdbc.empleados.ws.server.EmpleadoArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.ws.empleados.jdbc/EmpleadosService/getEmpleadosRequest", output = "http://server.ws.empleados.jdbc/EmpleadosService/getEmpleadosResponse")
    public EmpleadoArray getEmpleados();

    /**
     * 
     * @param arg0
     * @return
     *     returns jdbc.empleados.ws.server.Empleado
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.ws.empleados.jdbc/EmpleadosService/getEmpleadoRequest", output = "http://server.ws.empleados.jdbc/EmpleadosService/getEmpleadoResponse")
    public Empleado getEmpleado(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.ws.empleados.jdbc/EmpleadosService/insertaEmpleadoRequest", output = "http://server.ws.empleados.jdbc/EmpleadosService/insertaEmpleadoResponse")
    public boolean insertaEmpleado(
        @WebParam(name = "arg0", partName = "arg0")
        Empleado arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.ws.empleados.jdbc/EmpleadosService/eliminaEmpleadoRequest", output = "http://server.ws.empleados.jdbc/EmpleadosService/eliminaEmpleadoResponse")
    public boolean eliminaEmpleado(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}