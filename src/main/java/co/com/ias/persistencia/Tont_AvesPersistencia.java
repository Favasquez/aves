package co.com.ias.persistencia;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import co.com.ias.Exception.ExamenException;
import co.com.ias.dominio.Tont_Aves;
import co.com.ias.entidad.Tont_AvesEntidad;
import co.com.ias.repositorioJPA.Tont_AvesRepositorio;

@Service
public class Tont_AvesPersistencia {
	
	@Autowired
	Tont_AvesRepositorio tont_AvesRepositorio;
	
	public void crearAve(Tont_Aves tont_Aves) {
		Tont_AvesEntidad tont_AvesEntidad = new Tont_AvesEntidad();
		tont_AvesRepositorio.save(tont_AvesEntidad);
	}
	
	public Tont_AvesEntidad actualizarAve(Tont_AvesEntidad tont_Aves,String id)
	{
		Optional<Tont_AvesEntidad> opcionAve = tont_AvesRepositorio.findById(id);
		if (!opcionAve.isPresent())
			throw new ExamenException("NO SE HA ENCONTRADO AVES");

		tont_Aves.setCdave(id);
		tont_AvesRepositorio.save(tont_Aves);
		return tont_Aves;

	}
	
	public void eliminarAve(String cdave) {
		tont_AvesRepositorio.deleteById(cdave);
	}
	
	

}
