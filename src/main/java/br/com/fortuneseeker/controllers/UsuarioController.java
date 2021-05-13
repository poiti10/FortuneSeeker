package br.com.fortuneseeker.controllers;

import br.com.fortuneseeker.entities.Usuario;
import br.com.fortuneseeker.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    public UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/usuarios") //como e usuario um /usuario ja serve
    public List<Usuario> recuperaTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/saudacao")
    public String saudacao(){
        return "ola";
    }
}
