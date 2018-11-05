package co.com.ias.builder;

import co.com.ias.dominio.Tont_Aves;
import co.com.ias.entidad.Tont_AvesEntidad;


public abstract class Tont_AvesBuilder {
	
	public static Tont_Aves convertiraDomain(Tont_AvesEntidad tont_AvesEntidad) {
		return new Tont_Aves(tont_AvesEntidad.getCdave(),
				tont_AvesEntidad.getDsNombre_Cientifico(), 
				tont_AvesEntidad.getDsNombre_Comun(), 
				Tont_PaisesBuilder.convertiraDomain(tont_AvesEntidad.getTont_Paises()));
	}
	
	public static Tont_AvesEntidad convertiraEntity(Tont_Aves tont_Aves) {
		Tont_AvesEntidad aveEntidad = new Tont_AvesEntidad();
		aveEntidad.setCdave(tont_Aves.getCdave());
		aveEntidad.setDsNombre_Comun(tont_Aves.getDsNombre_Comun());
		aveEntidad.setDsNombre_Cientifico(tont_Aves.getDsNombre_Cientifico());
		aveEntidad.setTont_Paises(Tont_PaisesBuilder.convertiraEntity(tont_Aves.getTont_Paises()));
		return aveEntidad;
	}

}
