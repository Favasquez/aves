package co.com.ias.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ias.dominio.Tont_Paises;
import co.com.ias.servicio.Tont_PaisesServicio;

@RestController
public class Tont_PaisesControlador {
	
	@Autowired
	Tont_PaisesServicio tont_PaisesServicio;
	
	
	@GetMapping("/paises")
    public List<Tont_Paises> registros(){
    	return tont_PaisesServicio.registrosPaises();
    }

}
