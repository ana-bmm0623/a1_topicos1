package br.unitins.repository;

import java.util.List;

import br.unitins.model.Oculos;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OculosRepository implements PanacheRepository<Oculos> {
    public List<Oculos> findByReferencia(String referencia) {
        return find("UPPER(referencia) LIKE UPPER(?1) ", "%" + referencia + "%").list();
    }

}