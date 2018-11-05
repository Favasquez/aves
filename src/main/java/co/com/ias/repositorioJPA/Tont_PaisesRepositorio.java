package co.com.ias.repositorioJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.ias.entidad.Tont_PaisesEntidad;

@Repository
public interface Tont_PaisesRepositorio extends JpaRepository<Tont_PaisesEntidad, String> {

}
