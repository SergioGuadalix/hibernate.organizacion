package Pojos;
/**
 * Autor: Sergio Guadalix Romero
 */
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Departamento {

	long id_depto;
	String nom_depto;
	private Set<Empleado> empleados;
	Sede sede;
	
	
	public Departamento() {
		
	}
	
	public Departamento(String nom_depto) {
		super();
		this.nom_depto = nom_depto;
	}
	
	@Id
	@Column(name="Departamento_ID")
	@GeneratedValue
	public long getId_depto() {
		return id_depto;
	}

	public void setId_depto(long id_depto) {
		this.id_depto = id_depto;
	}

	@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
	@OnDelete( action = OnDeleteAction.CASCADE )
	public Set<Empleado> getEmpleados(){
		return empleados;
	}
	
	public void setEmpleados(Set<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getNom_depto() {
		return nom_depto;
	}
	public void setNom_depto(String nom_depto) {
		this.nom_depto = nom_depto;
	}

	@ManyToOne
	@JoinColumn(name="Sede_ID")
	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	
	
}
