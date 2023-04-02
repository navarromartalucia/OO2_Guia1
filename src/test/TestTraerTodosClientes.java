package test;

import java.util.ArrayList;
import java.util.List;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerTodosClientes {
	public static void main(String[] args) {
		//List<Cliente> clientes = new ArrayList<Cliente>();
		ClienteABM abm = new ClienteABM();
		//clientes = abm.traer();
		System.out.println(abm.traer());

	}
}