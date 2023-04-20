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
	
	public void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public long getIdEvento () {
		return this.idEvento;
	}
	
	protected void setIdCliente(long idEvento) {
		this.idEvento = idEvento;
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
		return "\n" + this.idEvento + ", evento: " + this.evento + ", fecha: " + this.fecha + "\n 	Clientes: " + this.clientes;
	}
	
	public boolean agregarClientes(Cliente c) {
		return this.clientes.add(c);
	}
	
	public boolean eliminarClientes(Cliente c) {
		return this.clientes.remove(c);
	}
}
