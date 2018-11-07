package co.com.ias.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import co.com.ias.dominio.Tont_Paises;
import co.com.ias.persistencia.Tont_PaisesPersistencia;

@Service
public class Tont_PaisesServicio {
	
	@Autowired
	Tont_PaisesPersistencia tont_PaisesPersistencia;
	
	
	public List<Tont_Paises> registrosPaises() {
	    return tont_PaisesPersistencia.list();	
	}

}
