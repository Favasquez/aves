package co.com.ias.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import co.com.ias.builder.Tont_ZonaBuilder;
import co.com.ias.dominio.Tont_Zona;
import co.com.ias.repositorioJPA.Tont_ZonaRepositorio;

@Component
public class Tont_ZonaPersistencia {
	
	@Autowired
	Tont_ZonaRepositorio tont_ZonaRepositorio;
	
	public List<Tont_Zona> list(){
		List<Tont_Zona> tont_Zona = new ArrayList<>();
		tont_ZonaRepositorio.findAll().forEach(tont_ZonaEntidad -> 
		tont_Zona.add(Tont_ZonaBuilder.convertiraDomain(tont_ZonaEntidad)));
		return tont_Zona;
	}
}
