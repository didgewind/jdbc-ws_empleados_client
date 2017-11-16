package jdbc.empleados.ws.extclient;


import java.util.List;

import jdbc.empleados.ws.server.Empleado;
import jdbc.empleados.ws.server.EmpleadosService;
import jdbc.empleados.ws.server.EmpleadosServiceImplService;

public class EmpleadosExtSoapClient {

	public static void main(String[] args) {
		EmpleadosServiceImplService serviceImpl = new EmpleadosServiceImplService();
		
		//We need to pass interface and model beans to client
		EmpleadosService empleadosService = serviceImpl.getEmpleadosServiceImplPort();
		
		listaEmpleados(empleadosService.getEmpleados().getItem());
		System.out.println(empleadosService.getEmpleado("34334789H").getApellidos());
		
	}
	
	private static void listaEmpleados(List<Empleado> empleados) {
		for (Empleado emp : empleados) {
			listaEmpleado(emp);
		}
	}
	
	private static void listaEmpleado(Empleado emp) {
		System.out.println(String.format("%s - %s - %s - %d", emp.getCif(), emp.getNombre(),
				emp.getApellidos(), emp.getEdad()));
	}

}
