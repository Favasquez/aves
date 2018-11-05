package co.com.ias.builder;

import co.com.ias.dominio.Tont_Zona;
import co.com.ias.entidad.Tont_ZonaEntidad;

public abstract class Tont_ZonaBuilder {

	public static Tont_Zona convertiraDomain(Tont_ZonaEntidad tontZonaEntidad) {
		return new Tont_Zona(tontZonaEntidad.getCdZona(),
				tontZonaEntidad.getDsNombre(),
				Tont_PaisesBuilder.convertiraDomain(tontZonaEntidad.getTont_Paises()));
	}
	
	public static Tont_ZonaEntidad convertiraEntity(Tont_Zona tontZona) {
		Tont_ZonaEntidad zonaEntidad = new Tont_ZonaEntidad();
		zonaEntidad.setCdZona(tontZona.getCdZona());
		zonaEntidad.setDsNombre(tontZona.getDsNombre());
		if(tontZona.getTont_Paises() != null)
			zonaEntidad.setTont_Paises(Tont_PaisesBuilder.convertiraEntity(tontZona.getTont_Paises()));
		
		return zonaEntidad;
	}
}
