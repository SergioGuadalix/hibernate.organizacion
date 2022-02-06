package Pojos;
/**
* Autor: Sergio Guadalix Romero
*/
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Sede {
	int id_sede;
	String nom_sede;
	
	private Set<Departamento> departamentos;
	private Set<Proyecto> proyectos = new HashSet<Proyecto>();
	
	public Sede() {
		
	}
		
	public Sede(String nom_sede) {
		super();
		this.nom_sede = nom_sede;
	}
	
	public void addProyecto (Proyecto proyecto) {
		this.proyectos.add(proyecto);
	}

	@Id
	@Column(name="Sede_ID")
	@GeneratedValue
	public int getId_sede() {
		return id_sede;
	}
	public void setId_sede(int id_sede) {
		this.id_sede = id_sede;
	}
	
	@OneToMany(mappedBy="sede", cascade = CascadeType.ALL)
	public Set<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Set<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name="Proyecto_Sede", joinColumns = @JoinColumn(name="Sede_ID"), inverseJoinColumns = @JoinColumn(name="Proyecto_ID")
			)
	public Set<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(Set<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public String getNom_sede() {
		return nom_sede;
	}
	public void setNom_sede(String nom_sede) {
		this.nom_sede = nom_sede;
	}
}
