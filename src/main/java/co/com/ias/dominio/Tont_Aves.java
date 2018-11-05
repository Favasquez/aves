package co.com.ias.dominio;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tont_Aves {
	
	private String cdave;
	private String dsNombre_Comun;
	private String dsNombre_Cientifico;
	private List<Tont_Paises> tont_Paises;
	
	public Tont_Aves() {
		super();
	}
	
	public Tont_Aves(String cdave, String dsNombre_Comun, String dsNombre_Cientifico, List<Tont_Paises> tont_Paises) {
		super();
		this.cdave = cdave;
		this.dsNombre_Comun = dsNombre_Comun;
		this.dsNombre_Cientifico = dsNombre_Cientifico;
		this.tont_Paises = tont_Paises;
	}


	public String getCdave() {
		return cdave;
	}
	public void setCdave(String cdave) {
		this.cdave = cdave;
	}
	public String getDsNombre_Comun() {
		return dsNombre_Comun;
	}
	public void setDsNombre_Comun(String dsNombre_Comun) {
		this.dsNombre_Comun = dsNombre_Comun;
	}
	public String getDsNombre_Cientifico() {
		return dsNombre_Cientifico;
	}
	public void setDsNombre_Cientifico(String dsNombre_Cientifico) {
		this.dsNombre_Cientifico = dsNombre_Cientifico;
	}

	public List<Tont_Paises> getTont_Paises() {
		return tont_Paises;
	}


	public void setTont_Paises(List<Tont_Paises> tont_Paises) {
		this.tont_Paises = tont_Paises;
	}


	
	
	
	
	
	
}
