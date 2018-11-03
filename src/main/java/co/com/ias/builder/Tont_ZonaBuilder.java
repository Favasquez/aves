package co.com.ias.builder;

import co.com.ias.dominio.Tont_Zona;
import co.com.ias.entidad.Tont_PaisesEntidad;
import co.com.ias.entidad.Tont_ZonaEntidad;

public class Tont_ZonaBuilder {

	Tont_PaisesBuilder tont_PaisesBuilder = new Tont_PaisesBuilder();
	
	public Tont_Zona convertiraDomain(Tont_ZonaEntidad tont_ZonaEntidad) {
		return new Tont_Zona(tont_ZonaEntidad.getCdZona(),
				tont_ZonaEntidad.getDsNombre(),
				tont_PaisesBuilder.convertiraDomain((Tont_PaisesEntidad) tont_ZonaEntidad.getTont_Paises()));
	}
	
	public Tont_Zona convertiraEntity(Tont_Zona tont_Zona) {
		return new Tont_Zona(tont_Zona.getCdZona(),
				tont_Zona.getDsNombre(), 
				tont_PaisesBuilder.convertiraEntity(tont_Zona.getTont_Paises()));
				
	}
}
