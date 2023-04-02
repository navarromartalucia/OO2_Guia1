package negocio;

import java.time.LocalDate;
import java.util.List;
import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	ClienteDao dao = new ClienteDao();

	public Cliente traer(int idCliente) {
		Cliente c = dao.traer(idCliente);
		return c;
	}

	public Cliente traer(long dni) {
		Cliente c = dao.traer(dni);
		return c;
	}

	public int agregar(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento)throws Exception {
		if(this.traer(dni) != null) throw new Exception("ERROR: El DNI ya ha sido ingresado");
		Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		return dao.agregar(c);
	}
			
	public void modificar(Cliente c)throws Exception {
		//implementar antes de actualizar que no exista un cliente con el mismo
		//documento a modificar y con el mismo id, lanzar la Exception
		//TODO: Averiguar que wea con el id
		if(this.traer(c.getDni()) != null ) throw new Exception("ERROR: El DNI a ingresar ya se encuentra en la base de datos");
		dao.actualizar(c);
	}
			
	public void eliminar(long idCliente)throws Exception {
		//en este caso es física en gral. no se se aplicaría este caso de uso, si
		//se hiciera habría que validar que el cliente no tenga dependencias
		Cliente c = dao.traer(idCliente);
		if(this.traer(c.getDni()) == null) throw new Exception ("ERROR: El cliente que desea eliminar no se ha encontrado");
		dao.eliminar(c);
	}
			
	public List<Cliente> traer() {
		return dao.traer();
	}
}
