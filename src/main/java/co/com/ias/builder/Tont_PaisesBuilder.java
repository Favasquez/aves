package co.com.ias.builder;

import java.util.HashSet;
import java.util.Set;

import co.com.ias.dominio.Tont_Paises;
import co.com.ias.entidad.Tont_PaisesEntidad;

public class Tont_PaisesBuilder {

	Tont_ZonaBuilder tont_ZonaBuilder = new Tont_ZonaBuilder();
	Tont_ZonaBuilder zonaBuilder = new Tont_ZonaBuilder();

	public Set<Tont_Paises> convertiraDomain(Set<Tont_PaisesEntidad> tont_PaisesEntidad) {
		Set<Tont_Paises> paisesDominio = new HashSet<>();
		for (Tont_PaisesEntidad paisEntidad : tont_PaisesEntidad) {
			paisesDominio.add(new Tont_Paises(paisEntidad.getCdPais(), paisEntidad.getDsNombre(),
					zonaBuilder.convertiraDomain(paisEntidad.getTont_Zona())));
		}
		return paisesDominio;
	}

	public Set<Tont_PaisesEntidad> convertiraEntity(Set<Tont_Paises> tont_Paises) {
		Set<Tont_PaisesEntidad> paisesEntidad = new HashSet<>();
		for (Tont_Paises paisDominio : tont_Paises) {
			Tont_PaisesEntidad paisEntidad = new Tont_PaisesEntidad();
			paisEntidad.setCdPais(paisDominio.getCdPais());
			paisEntidad.setDsNombre(paisDominio.getDsNombre());
			paisEntidad.setTont_Zona(zonaBuilder.convertiraEntity(paisDominio.getTont_Zona()));
			paisesEntidad.add(paisEntidad);
		}
		return paisesEntidad;

	}
}