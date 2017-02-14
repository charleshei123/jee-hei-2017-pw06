package service;

import hei.tp06.core.entity.Evenement;

import java.util.List;

/**
 * Created by N0stress on 14/02/2017.
 */
public interface EvenementService {

    List<Evenement> findByTitle(String title);

    List<Evenement> findById(long id);

    void saveEvenement(Evenement evenement);


    List<Evenement> findAll();

    void deleteEvenement(long id);
}
