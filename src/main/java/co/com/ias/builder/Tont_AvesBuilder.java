package co.com.ias.builder;

import co.com.ias.dominio.Tont_Aves;
import co.com.ias.entidad.Tont_AvesEntidad;
import co.com.ias.entidad.Tont_PaisesEntidad;


public class Tont_AvesBuilder {
	
	Tont_PaisesBuilder tont_PaisesBuilder = new Tont_PaisesBuilder();
	
	public Tont_Aves convertiraDomain(Tont_AvesEntidad tont_AvesEntidad) {
		return new Tont_Aves(tont_AvesEntidad.getCdave(),
				tont_AvesEntidad.getDsNombre_Cientifico(), 
				tont_AvesEntidad.getDsNombre_Comun(), 
				tont_PaisesBuilder.convertiraDomain(tont_AvesEntidad.getTont_Paises()));
	}
	
	public Tont_Aves convertiraEntity(Tont_Aves tont_Aves) {
		return new Tont_Aves(tont_Aves.getCdave(), 
				tont_Aves.getDsNombre_Comun(),
				tont_Aves.getDsNombre_Comun(),
				tont_PaisesBuilder.convertiraEntity(tont_Aves.getTont_Paises()));
	}

}
