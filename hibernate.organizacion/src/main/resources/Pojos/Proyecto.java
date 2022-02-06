package Pojos;
/**
 * Autor: Sergio Guadalix Romero
 */
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Proyecto {
	long id_proy;
	Date f_inicio;
	Date f_fin;
	String nom_proy;
	
	private Set<Sede> sedes = new HashSet<Sede>();

	public Proyecto(Date f_inicio, Date f_fin, String nom_proy) {
		super();
		this.f_inicio = f_inicio;
		this.f_fin = f_fin;
		this.nom_proy = nom_proy;
	}

	public Proyecto() {
		
	}
	
	public void addSedes (Sede sede) {
		this.sedes.add(sede);
	}
	@Id
	@GeneratedValue
	@Column(name="Proyecto_ID")
	public long getId_proy() {
		return id_proy;
	}
	public void setId_proy(long id_proy) {
		this.id_proy = id_proy;
	}
	@ManyToMany(mappedBy = "proyectos")
	public Set<Sede> getSedes() {
		return sedes;
	}

	public void setSedes(Set<Sede> sedes) {
		this.sedes = sedes;
	}

	public Date getF_inicio() {
		return f_inicio;
	}
	public void setF_inicio(Date f_inicio) {
		this.f_inicio = f_inicio;
	}
	public Date getF_fin() {
		return f_fin;
	}
	public void setF_fin(Date f_fin) {
		this.f_fin = f_fin;
	}
	public String getNom_proy() {
		return nom_proy;
	}
	public void setNom_proy(String nom_proy) {
		this.nom_proy = nom_proy;
	}
	
	
}
