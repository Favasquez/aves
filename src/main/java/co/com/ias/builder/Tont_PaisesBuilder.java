package co.com.ias.builder;

import java.util.ArrayList;
import java.util.List;

import co.com.ias.dominio.Tont_Paises;
import co.com.ias.entidad.Tont_PaisesEntidad;

public abstract class Tont_PaisesBuilder {

	public static List<Tont_Paises> convertiraDomain(List<Tont_PaisesEntidad> tont_PaisesEntidad) {
		List<Tont_Paises> paisesDominio = new ArrayList<>();
		for (Tont_PaisesEntidad paisEntidad : tont_PaisesEntidad) {
			paisesDominio.add(new Tont_Paises(paisEntidad.getCdPais(), paisEntidad.getDsNombre(),
					Tont_ZonaBuilder.convertiraDomain(paisEntidad.getTont_Zona())));
		}
		return paisesDominio;
	}

	public static List<Tont_PaisesEntidad> convertiraEntity(List<Tont_Paises> tont_Paises) {
		List<Tont_PaisesEntidad> paisesEntidad = new ArrayList<>();
		for (Tont_Paises paisDominio : tont_Paises) {
			Tont_PaisesEntidad paisEntidad = new Tont_PaisesEntidad();
			paisEntidad.setCdPais(paisDominio.getCdPais());
			paisEntidad.setDsNombre(paisDominio.getDsNombre());
			paisEntidad.setTont_Zona(Tont_ZonaBuilder.convertiraEntity(paisDominio.getTont_Zona()));
			paisesEntidad.add(paisEntidad);
		}
		return paisesEntidad;
	}
}