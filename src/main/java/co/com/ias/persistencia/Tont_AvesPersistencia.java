package co.com.ias.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import co.com.ias.Exception.ExamenException;
import co.com.ias.builder.Tont_AvesBuilder;
import co.com.ias.dominio.Tont_Aves;
import co.com.ias.entidad.Tont_AvesEntidad;
import co.com.ias.repositorioJPA.Tont_AvesRepositorio;

@Component
public class Tont_AvesPersistencia {
	
	@Autowired
	Tont_AvesRepositorio tont_AvesRepositorio;
	
	public void crearAve(Tont_Aves tont_Aves) {
		tont_AvesRepositorio.save(Tont_AvesBuilder.convertiraEntity(tont_Aves));
	}
	
	
	public Tont_Aves actualizarAve(Tont_Aves tont_Aves,String cdave)
	{
		Optional<Tont_AvesEntidad> opcionAve = tont_AvesRepositorio.findById(cdave);
		if (!opcionAve.isPresent())
			throw new ExamenException("NO SE HA ENCONTRADO AVES");

		tont_Aves.setCdave(cdave);
		tont_AvesRepositorio.save(Tont_AvesBuilder.convertiraEntity(tont_Aves));
		
		return tont_Aves;

	}
	
	public void eliminarAve(String cdave) {
		Optional<Tont_AvesEntidad> opcionAve = tont_AvesRepositorio.findById(cdave);
		if (!opcionAve.isPresent())
			throw new ExamenException("NO SE HA ENCONTRADO AVES");
		tont_AvesRepositorio.deleteById(cdave);
	}
	
	public List<Tont_Aves> list(){
		List<Tont_Aves> tont_Aves = new ArrayList<>();
		tont_AvesRepositorio.findAll().forEach(tont_AvesEntidad -> 
		tont_Aves.add(Tont_AvesBuilder.convertiraDomain(tont_AvesEntidad)));
		return tont_Aves;
	}
}
