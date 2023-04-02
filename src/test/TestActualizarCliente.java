package test;

import java.time.LocalDate;

import datos.Cliente;
import negocio.ClienteABM;

public class TestActualizarCliente {

	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		Cliente c = abm.traer(41473969);
		System.out.println("Cliente: " + c);
		c.setFechaDeNacimiento(LocalDate.of(1998, 8, 14));
		c.setDni(17444627);
		try{
			abm.modificar(c);
			System.out.println("Cliente: " + c);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
