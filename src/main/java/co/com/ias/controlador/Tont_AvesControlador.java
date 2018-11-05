package co.com.ias.controlador;

import java.util.List;

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
	
	@PutMapping("/actualizar/ave/{id}")
	public Tont_Aves updateStudent(@RequestBody Tont_Aves tont_Aves, @PathVariable String id) {
		tont_AvesServicio.actualizarAve(tont_Aves, id);
		return tont_Aves;
	}
	
	@DeleteMapping("/eliminar/ave/{id}")
	public void eliminarAve(@PathVariable String id) {
		tont_AvesServicio.eliminarAve(id);
	}
	
	@GetMapping("/registros")
    public List<Tont_Aves> registros(){
    	return tont_AvesServicio.registrosAve();
    }
	
	
}
