package ar.gabriel.springsecurityjwt.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.gabriel.springsecurityjwt.models.Roles;

@Repository
public interface IRolesRepo extends JpaRepository<Roles, Long> {

    //Metodo de busqueda de rol por nombre en BBDD;
    Optional<Roles> FindBYName  (String rolName);

    
    
}
