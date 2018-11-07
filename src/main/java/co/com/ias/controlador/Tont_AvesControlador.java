package co.com.ias.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.ias.dominio.Tont_Aves;
import co.com.ias.servicio.Tont_AvesServicio;


@CrossOrigin(origins = "http://localhost:4200")
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

	@GetMapping("/registros/ave")
    public List<Tont_Aves> registros(){
    	return tont_AvesServicio.registrosAve();
    }
    
	@GetMapping("/registros/ave/nombre/{name}")
    public Tont_Aves registrosAveNombres(@PathVariable String name){
    	return tont_AvesServicio.busquedaPornombre(name);
    }
	
	@GetMapping("/registros/ave/zona/{zona}")
    public List<Tont_Aves> registrosAveZona(@PathVariable String zona){
    	return tont_AvesServicio.busquedaPorZona(zona);
    }
}
