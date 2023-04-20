package test;

import datos.Cliente;
import datos.Evento;
import negocio.ClienteABM;
import negocio.EventoABM;

public class TestAgregarClienteAEVento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventoABM eventoABM = new EventoABM();
		ClienteABM clienteABM = new ClienteABM();
		long idEvento = 1;
		long idCliente = 3;
		Evento e = eventoABM.traer(1);
		//Cliente c1 = clienteABM.traer(1);
		Cliente c3 = clienteABM.traer(idCliente);
		//eventoABM.agregarCliente(e, c1);
		eventoABM.agregarCliente(e, c3);
		//System.out.println(c3);
		System.out.println(eventoABM.traerEventoYClientes(e));
	}

}
