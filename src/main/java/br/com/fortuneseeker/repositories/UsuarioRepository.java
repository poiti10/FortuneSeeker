package br.com.fortuneseeker.repositories;

import br.com.fortuneseeker.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

}
