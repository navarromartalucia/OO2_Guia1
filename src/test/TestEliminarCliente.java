package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		try{
			abm.eliminar(4);
			System.out.println("Eliminado");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
