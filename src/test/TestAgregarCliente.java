package test;

import java.time.LocalDate;
import negocio.ClienteABM;

public class TestAgregarCliente {
	public static void main(String[] args) {
		String apellido = "Schwind";
		String nombre = "Lu";
		int documento = 41473969;
		LocalDate fechaDeNacimiento = LocalDate.of(2020, 8, 14);
		ClienteABM abm = new ClienteABM();
		//long ultimoIdCliente = abm.agregar(apellido, nombre, documento, fechaDeNacimiento);
		try{
			abm.agregar("Navarro", "Luis", 17444627,LocalDate.of(1965, 11, 15));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
