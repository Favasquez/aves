package co.com.ias.dominio;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tont_Zona {
	
	private String cdZona;
	private String dsNombre;
	@JsonProperty
	private List<Tont_Paises> tont_Paises;
	
	
	public Tont_Zona() {
		super();
	}

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

	public List<Tont_Paises> getTont_Paises() {
		return tont_Paises;
	}

	public void setTont_Paises(List<Tont_Paises> tont_Paises) {
		this.tont_Paises = tont_Paises;
	}

	public Tont_Zona(String cdZona, String dsNombre, List<Tont_Paises> tont_Paises) {
		super();
		this.cdZona = cdZona;
		this.dsNombre = dsNombre;
		this.tont_Paises = tont_Paises;
	}



	
	
}
