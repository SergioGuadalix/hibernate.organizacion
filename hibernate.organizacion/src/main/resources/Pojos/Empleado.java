package Pojos;
/**
 * Autor: Sergio Guadalix Romero
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

@Entity
public class Empleado {
	
	public Empleado(String nom_emp) {
		super();
		this.nom_emp = nom_emp;
	}

	long dni;
	String nom_emp;
	
	Departamento departamento;
	Empleado_datos_prof datosempleado;
	
	@Id
	@GeneratedValue
	@Column
	public long getDni() {
		return dni;
	}
	
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	//@PrimaryKeyJoinColumn
	public Empleado_datos_prof getdatosempleado() {
		return datosempleado;
	}
	
	public void setDatosempleado(Empleado_datos_prof datosempleado) {
		this.datosempleado = datosempleado;
	}
	public String getNom_emp() {
		return nom_emp;
	}
	public void setNom_emp(String nom_emp) {
		this.nom_emp = nom_emp;
	}
	@ManyToOne
	@JoinColumn(name="Departamento_ID")
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
