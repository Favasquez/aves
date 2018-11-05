package co.com.ias.servicio;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ias.dominio.Tont_Aves;
import co.com.ias.persistencia.Tont_AvesPersistencia;

@Service
public class Tont_AvesServicio {
	
	@Autowired
	Tont_AvesPersistencia tont_AvesPersistencia;
	
		public void crearAve(Tont_Aves tont_Aves) {
    	tont_AvesPersistencia.crearAve(tont_Aves);
	}
		
		public void actualizarAve(Tont_Aves tont_Aves,String cdave) {
	    	tont_AvesPersistencia.actualizarAve(tont_Aves, cdave);
		}
		
		public void eliminarAve(String cdave) {
			tont_AvesPersistencia.eliminarAve(cdave);
		}
		
		public List<Tont_Aves>registrosAve() {
		    return tont_AvesPersistencia.list();	
		}
}
