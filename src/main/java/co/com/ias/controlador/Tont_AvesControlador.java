package co.com.ias.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.com.ias.dominio.Tont_Aves;
import co.com.ias.servicio.Tont_AvesServicio;

@RestController
public class Tont_AvesControlador {
	
@Autowired
Tont_AvesServicio tont_AvesServicio;
	
 @PostMapping("/crear/ave")
    public void crearAve(@RequestBody Tont_Aves tont_Aves) {
    	tont_AvesServicio.crearAve(tont_Aves);
    }
}
