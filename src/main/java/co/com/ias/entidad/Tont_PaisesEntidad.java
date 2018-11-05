package co.com.ias.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "Tont_Paises")
public class Tont_PaisesEntidad {

	@Id
	private String cdPais;
	@Column
	private String dsNombre;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cdZona")
	private Tont_ZonaEntidad tont_Zona;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE, mappedBy = "tont_Paises")
	private List<Tont_AvesEntidad> tont_Aves;

	public String getCdPais() {
		return cdPais;
	}

	public void setCdPais(String cdPais) {
		this.cdPais = cdPais;
	}

	public String getDsNombre() {
		return dsNombre;
	}

	public void setDsNombre(String dsNombre) {
		this.dsNombre = dsNombre;
	}

	public Tont_ZonaEntidad getTont_Zona() {
		return tont_Zona;
	}

	public void setTont_Zona(Tont_ZonaEntidad tont_Zona) {
		this.tont_Zona = tont_Zona;
	}

	public List<Tont_AvesEntidad> getTont_Aves() {
		return tont_Aves;
	}

	public void setTont_Aves(List<Tont_AvesEntidad> tont_Aves) {
		this.tont_Aves = tont_Aves;
	}

}
