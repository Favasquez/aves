package co.com.ias.entidad;

import java.util.Set;

import javax.persistence.*;


@Entity(name="Tont_Zona")
public class Tont_ZonaEntidad {
	
	@Id
	@GeneratedValue
	private String cdZona;
	@Column
	private String dsNombre;
	@OneToMany(mappedBy = "tont_Zona", cascade = CascadeType.ALL)
	private Set<Tont_PaisesEntidad> tont_Paises;
	

	public String getCdZona() {
		return cdZona;
	}
	public void setCdZona(String cdZona) {
		this.cdZona = cdZona;
	}
	public String getDsNombre() {
		return dsNombre;
	}
	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}
	public Set<Tont_PaisesEntidad> getTont_Paises() {
		return tont_Paises;
	}
	public void setTont_Paises(Set<Tont_PaisesEntidad> tont_Paises) {
		this.tont_Paises = tont_Paises;
	}
}
