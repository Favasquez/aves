package co.com.ias.repositorioJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.ias.entidad.Tont_ZonaEntidad;

@Repository
public interface Tont_ZonaRepositorio extends JpaRepository<Tont_ZonaEntidad, String>{

}
