package init.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="aulas")
public class Aula {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int capacidad;
	private boolean proyector;
	private boolean altavoces;
	@OneToMany(mappedBy="aula")
	private List<Reserva> reservas;
	
	public Aula(int id, String nombre, int capacidad, boolean proyector, boolean altavoces) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.proyector = proyector;
		this.altavoces = altavoces;
	}

	public Aula() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isProyector() {
		return proyector;
	}

	public void setProyector(boolean proyector) {
		this.proyector = proyector;
	}
	
	public boolean isAltavoces() {
		return altavoces;
	}

	public void setAltavoces(boolean altavoces) {
		this.altavoces = altavoces;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
}
