package jdbc.empleados.ws.extclient;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import jdbc.empleados.model.Empleado;

public class EmpleadosExtRestClient {

	private static final String REST_URI 
		= "http://localhost:8080/empleados-ws/rest/empleados";

	private Client client = ClientBuilder.newClient();

	public static void main(String[] args) {
		new EmpleadosExtRestClient().go();
	}
	
	private void go() {
		System.out.println(this.getEmpleadoJson("21094387T"));
	}
	
	private Empleado getEmpleadoJson(String cif) {
		return client
				.target(REST_URI)
				.path(cif)
				.request(MediaType.APPLICATION_JSON)
				.get(Empleado.class);
  }
}
