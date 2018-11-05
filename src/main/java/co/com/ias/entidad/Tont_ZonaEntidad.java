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
	
}
