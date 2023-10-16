package ar.gabriel.springsecurityjwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.gabriel.springsecurityjwt.models.Usuarios;

@Repository
public interface IUsuariosInterface extends JpaRepository<Usuarios, Long> {

    // Metodo para buscar un usuario mediante nombre;

    Optional<Usuarios> findByUserName(String userName);

    // Metodo para verificar usuario existente en BBDD;

    Boolean ExistByUsername(String userName);

}
