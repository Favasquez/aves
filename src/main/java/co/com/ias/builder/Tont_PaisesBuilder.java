package co.com.ias.builder;

import co.com.ias.dominio.Tont_Paises;
import co.com.ias.entidad.Tont_PaisesEntidad;

public class Tont_PaisesBuilder {
	
	Tont_ZonaBuilder tont_ZonaBuilder = new Tont_ZonaBuilder();
	public Tont_Paises convertiraDomain(Tont_PaisesEntidad tont_PaisesEntidad) {
		return new Tont_Paises(tont_PaisesEntidad.getCdPais(), tont_PaisesEntidad.getDsNombre(),
				tont_ZonaBuilder.convertiraDomain(tont_PaisesEntidad.getTont_Zona()));
	}
	
	public Tont_Paises convertiraEntity(Tont_Paises tont_Zona) {
		return new Tont_Paises(tont_Zona.getCdPais(), tont_Zona.getDsNombre(), 
				tont_ZonaBuilder.convertiraEntity(tont_Zona.getTont_Zona()));

}
}