package hei.tp06.core.dao;

import hei.tp06.core.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by N0stress on 14/02/2017.
 */
public interface EvenementDAO extends JpaRepository<Evenement, Long> {

    Evenement findById(long id);

    Evenement findByTitle(String title);

    List<Evenement> findAll();
}
