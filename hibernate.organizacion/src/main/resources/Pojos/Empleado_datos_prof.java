package Pojos;
/**
 * Autor: Sergio Guadalix Romero
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Empleado_datos_prof {
	
	long dni;
	String categoria;
	float sueldo_bruto_anual;
	Empleado empleado;
	
	public Empleado_datos_prof(String categoria, float sueldo_bruto_anual) {
		super();
		this.categoria = categoria;
		this.sueldo_bruto_anual = sueldo_bruto_anual;
	}

	@Id
	@GeneratedValue(generator = "foreigngen")
	@GenericGenerator(name="foreigngen",strategy="foreign", parameters = @Parameter(name="property",value="empleado"))
	@Column
	public long getDni() {
		return dni;
	}
	
	@OneToOne (mappedBy = "datosempleado")
	public Empleado getEmpleado() {
		return empleado;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getSueldo_bruto_anual() {
		return sueldo_bruto_anual;
	}
	public void setSueldo_bruto_anual(float sueldo_bruto_anual) {
		this.sueldo_bruto_anual = sueldo_bruto_anual;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
}
