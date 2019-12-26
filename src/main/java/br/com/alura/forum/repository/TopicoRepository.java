package br.com.alura.forum.repository;

import br.com.alura.forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    // Curso é a entidade relacionada e nome o nome do atributo
    /*
        Underline significa que é pra ele buscar da entidade Curso
        pois caso aconteca de haver um mesmo atributo na Classe Topico
        haveria ambiguidade
    **/
    List<Topico> findByCurso_Nome(String nomeCurso);
}
