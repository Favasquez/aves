package co.com.ias.repositorioJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.ias.entidad.Tont_AvesEntidad;

@Repository
public interface Tont_AvesRepositorio extends JpaRepository<Tont_AvesEntidad, String> {

}
