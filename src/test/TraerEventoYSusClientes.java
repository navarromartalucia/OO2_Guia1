package test;

import datos.Evento;
import negocio.ClienteABM;
import negocio.EventoABM;

public class TraerEventoYSusClientes {
	public static void main(String[] args) {
		EventoABM eventoABM = new EventoABM();
		Evento e = eventoABM.traer(1);
		System.out.println(eventoABM.traerEventoYClientes(e));

	}
}
