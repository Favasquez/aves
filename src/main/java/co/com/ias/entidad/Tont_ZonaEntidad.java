package co.com.ias.entidad;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity(name="Tont_Zona")
public class Tont_ZonaEntidad {
	
	@Id
	private String cdZona;
	@Column
	private String dsNombre;
	@OneToMany(mappedBy = "tont_Zona", cascade = CascadeType.ALL)
	private List<Tont_PaisesEntidad> tont_Paises;
	
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
	public List<Tont_PaisesEntidad> getTont_Paises() {
		return tont_Paises;
	}
	public void setTont_Paises(List<Tont_PaisesEntidad> tont_Paises) {
		this.tont_Paises = tont_Paises;
	}
}
