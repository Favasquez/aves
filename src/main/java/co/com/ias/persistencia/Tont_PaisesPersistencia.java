package co.com.ias.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import co.com.ias.builder.Tont_PaisesBuilder;
import co.com.ias.dominio.Tont_Paises;
import co.com.ias.entidad.Tont_PaisesEntidad;
import co.com.ias.repositorioJPA.Tont_PaisesRepositorio;

@Component
public class Tont_PaisesPersistencia {
	
	@Autowired
	Tont_PaisesRepositorio tont_PaisesRepositorio;

	public List<Tont_Paises> list(){
		List<Tont_Paises> tont_pais = new ArrayList<>();
		tont_PaisesRepositorio.findAll().forEach(tont_paisesEntidad -> 
		tont_pais.add((Tont_Paises) Tont_PaisesBuilder.convertiraDomain((List<Tont_PaisesEntidad>) tont_paisesEntidad)));
		return tont_pais;
	}

}
