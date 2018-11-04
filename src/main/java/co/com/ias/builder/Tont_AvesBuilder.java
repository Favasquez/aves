package co.com.ias.builder;

import co.com.ias.dominio.Tont_Aves;
import co.com.ias.entidad.Tont_AvesEntidad;


public class Tont_AvesBuilder {
	
	Tont_PaisesBuilder tont_PaisesBuilder = new Tont_PaisesBuilder();
	
	public Tont_Aves convertiraDomain(Tont_AvesEntidad tont_AvesEntidad) {
		return new Tont_Aves(tont_AvesEntidad.getCdave(),
				tont_AvesEntidad.getDsNombre_Cientifico(), 
				tont_AvesEntidad.getDsNombre_Comun(), 
				tont_PaisesBuilder.convertiraDomain(tont_AvesEntidad.getTont_Paises()));
	}
	
	public Tont_AvesEntidad convertiraEntity(Tont_Aves tont_Aves) {
		Tont_AvesEntidad aveEntidad = new Tont_AvesEntidad();
		aveEntidad.setCdave(tont_Aves.getCdave());
		aveEntidad.setDsNombre_Comun(tont_Aves.getDsNombre_Comun());
		aveEntidad.setDsNombre_Cientifico(tont_Aves.getDsNombre_Cientifico());
		aveEntidad.setTont_Paises(tont_PaisesBuilder.convertiraEntity(tont_Aves.getTont_Paises()));
		return aveEntidad;
	}

}
