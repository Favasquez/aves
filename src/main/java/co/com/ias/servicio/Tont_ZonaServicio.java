package co.com.ias.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ias.dominio.Tont_Zona;
import co.com.ias.persistencia.Tont_ZonaPersistencia;

@Service
public class Tont_ZonaServicio {
	
	@Autowired
	Tont_ZonaPersistencia tont_ZonaPersistencia;
	
	public List<Tont_Zona> registrosZonas() {
	    return tont_ZonaPersistencia.list();	
	}

}
