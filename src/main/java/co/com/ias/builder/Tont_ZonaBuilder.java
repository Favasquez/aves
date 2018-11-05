package co.com.ias.builder;

import co.com.ias.dominio.Tont_Zona;
import co.com.ias.entidad.Tont_ZonaEntidad;

public abstract class Tont_ZonaBuilder {

	public static Tont_Zona convertiraDomain(Tont_ZonaEntidad tontZonaEntidad) {
		return new Tont_Zona(tontZonaEntidad.getCdZona(),
				tontZonaEntidad.getDsNombre()
				);
	}
	
	public static Tont_ZonaEntidad convertiraEntity(Tont_Zona tontZona) {
		Tont_ZonaEntidad zonaEntidad = new Tont_ZonaEntidad();
		zonaEntidad.setCdZona(tontZona.getCdZona());
		zonaEntidad.setDsNombre(tontZona.getDsNombre());
		return zonaEntidad;
	}
}
