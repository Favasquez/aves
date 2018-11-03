package co.com.ias.dominio;

public class Tont_Zona {
	
	private String cdZona;
	private String dsNombre;
	private Tont_Paises tont_Paises;
	
	
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

	public Tont_Paises getTont_Paises() {
		return tont_Paises;
	}

	public void setTont_Paises(Tont_Paises tont_Paises) {
		this.tont_Paises = tont_Paises;
	}

	public Tont_Zona(String cdZona, String dsNombre,Tont_Paises tont_Paises) {
		super();
		this.cdZona = cdZona;
		this.dsNombre = dsNombre;
		this.tont_Paises = tont_Paises;
	}



	
	
}
