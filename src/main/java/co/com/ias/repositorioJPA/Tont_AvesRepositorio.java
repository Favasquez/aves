package co.com.ias.repositorioJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.com.ias.entidad.Tont_AvesEntidad;

@Repository
public interface Tont_AvesRepositorio extends JpaRepository<Tont_AvesEntidad, String> {

	@Query("SELECT ave  FROM Tont_Aves ave WHERE ave.dsNombre_Comun = :nombre OR ave.dsNombre_Cientifico = :nombre")
	Tont_AvesEntidad findNamesAndNames(@Param("nombre") String nombre);

	@Query("SELECT DISTINCT ave FROM Tont_Aves ave, IN (ave.tont_Paises) pais WHERE pais.tont_Zona.cdZona = :cdZona")
	List<Tont_AvesEntidad>findNombreAndZona(@Param("cdZona") String zona);
}
