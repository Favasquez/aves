package co.com.ias.servicio;

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
		

}
