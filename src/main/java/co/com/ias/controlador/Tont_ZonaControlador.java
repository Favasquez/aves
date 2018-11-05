package co.com.ias.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ias.dominio.Tont_Zona;
import co.com.ias.servicio.Tont_ZonaServicio;

@RestController
public class Tont_ZonaControlador {
	
	@Autowired
	Tont_ZonaServicio tont_ZonaServicio;
	
	@GetMapping("/registros/zona")
    public List<Tont_Zona> registros(){
    	return tont_ZonaServicio.registrosZonas();
    }


}
