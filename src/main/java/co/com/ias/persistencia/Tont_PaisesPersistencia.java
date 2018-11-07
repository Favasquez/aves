package co.com.ias.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ias.builder.Tont_PaisesBuilder;
import co.com.ias.dominio.Tont_Paises;
import co.com.ias.repositorioJPA.Tont_PaisesRepositorio;

@Component
public class Tont_PaisesPersistencia {
	
	@Autowired
	Tont_PaisesRepositorio tont_PaisesRepositorio;

	public List<Tont_Paises> list(){
		return Tont_PaisesBuilder.convertiraDomain(tont_PaisesRepositorio.findAll());
	
	}

}
