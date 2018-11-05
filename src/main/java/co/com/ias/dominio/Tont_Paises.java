package co.com.ias.dominio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tont_Paises {
	private String cdPais;
	private String dsNombre;
	@JsonProperty
	private Tont_Zona tont_Zona;

	public Tont_Paises() {
		super();
	}

	public Tont_Paises(String cdPais, String dsNombre, Tont_Zona tont_Zona) {
		super();
		this.cdPais = cdPais;
		this.dsNombre = dsNombre;
		this.tont_Zona = tont_Zona;
	}

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

	public Tont_Zona getTont_Zona() {
		return tont_Zona;
	}

	public void setTont_Zona(Tont_Zona tont_Zona) {
		this.tont_Zona = tont_Zona;
	}
}
