package negocio;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.HibernateException;

import dao.EventoDao;
import datos.Cliente;
import datos.Evento;


public class EventoABM {
	EventoDao dao = new EventoDao();
	
	public Evento traer(long idEvento) {
		return dao.traer(idEvento);
	}
	
	public Evento traer(String evento) {
		return dao.traer(evento);
	}
	
	public int agregar(String evento, LocalDate fecha) throws Exception{
		if(this.traer(evento) != null) throw new Exception("ERROR: El evento ya ha sido ingresado");
		return dao.agregar(new Evento(evento, fecha));
	}
	
	public void actualizar(Evento e){
		dao.actualizar(e);
	}
	
	public void eliminar(long idEvento) {
		dao.eliminar(this.traer(idEvento));
	}
	
	public List<Evento> traer(){
		return dao.traer();
	}
	
	public void agregarCliente(Evento e, Cliente c) {
		//e.agregarClientes(c);
		e.getClientes().add(c);
		dao.actualizar(e);
	}
	
	public void eliminarCliente(Evento e, Cliente c) {
		e.eliminarClientes(c);
		dao.actualizar(e);
	}
	
	public Evento traerEventoYClientes(Evento e) {
		return dao.traerEventoYClientes(e.getIdEvento());
	}
}
