package datos;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

public class Evento {
	private long idEvento;
	private String evento;
	private LocalDate fecha;
	private Set<Cliente> clientes;
	
	public Evento(){}

	public Evento(String evento, LocalDate fecha) {
		super();
		this.evento = evento;
		this.fecha = fecha;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public boolean equals(Evento e) {
		return (this.evento.equalsIgnoreCase(e.evento) && this.fecha.isEqual(e.fecha) && this.idEvento == e.idEvento);
	}
	
	public String toString() {
		return "\n" + this.idEvento + ", evento: " + this.evento + "\n		fecha: " + this.fecha;
	}
}
