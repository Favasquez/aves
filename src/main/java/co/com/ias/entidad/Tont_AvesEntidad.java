package co.com.ias.entidad;


import java.util.Set;

import javax.persistence.*;

@Entity(name="Tont_Aves")

public class Tont_AvesEntidad {
	
	@Id
	@GeneratedValue
	private String cdave;
	@Column
	private String dsNombre_Comun;
	@Column
	private String dsNombre_Cientifico;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Tont_Aves_Pais", joinColumns = 
	@JoinColumn(name = "cdave", referencedColumnName = "cdave"), inverseJoinColumns = 
	@JoinColumn(name = "cdPais", referencedColumnName = "cdPais"))
	private Set<Tont_PaisesEntidad> tont_Paises;
	
	public String getCdave() {
		return cdave;
	}
	public void setCdave(String cdave) {
		this.cdave = cdave;
	}

	public String getDsNombre_Cientifico() {
		return dsNombre_Cientifico;
	}
	public void setDsNombre_Cientifico(String dsNombre_Cientifico) {
		this.dsNombre_Cientifico = dsNombre_Cientifico;
	}


	public String getDsNombre_Comun() {
		return dsNombre_Comun;
	}

	public void setDsNombre_Comun(String dsNombre_Comun) {
		this.dsNombre_Comun = dsNombre_Comun;
	}
	public Set<Tont_PaisesEntidad> getTont_Paises() {
		return tont_Paises;
	}
	public void setTont_Paises(Set<Tont_PaisesEntidad> tont_Paises) {
		this.tont_Paises = tont_Paises;
	}



	
}
