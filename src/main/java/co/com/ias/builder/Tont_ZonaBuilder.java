package co.com.ias.builder;

import co.com.ias.dominio.Tont_Zona;
import co.com.ias.entidad.Tont_ZonaEntidad;

public class Tont_ZonaBuilder {

	Tont_PaisesBuilder tontPaisesBuilder = new Tont_PaisesBuilder();
	
	public Tont_Zona convertiraDomain(Tont_ZonaEntidad tontZonaEntidad) {
		return new Tont_Zona(tontZonaEntidad.getCdZona(),
				tontZonaEntidad.getDsNombre(),
				tontPaisesBuilder.convertiraDomain(tontZonaEntidad.getTont_Paises()));
	}
	
	public Tont_ZonaEntidad convertiraEntity(Tont_Zona tontZona) {
		Tont_ZonaEntidad zonaEntidad = new Tont_ZonaEntidad();
		zonaEntidad.setCdZona(tontZona.getCdZona());
		zonaEntidad.setDsNombre(tontZona.getDsNombre());
		zonaEntidad.setTont_Paises(tontPaisesBuilder.convertiraEntity(tontZona.getTont_Paises()));
		return zonaEntidad;
	}
}
