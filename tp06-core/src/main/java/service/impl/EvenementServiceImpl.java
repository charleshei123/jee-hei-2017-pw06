package service.impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import service.EvenementService;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by N0stress on 14/02/2017.
 */
public class EvenementServiceImpl implements EvenementService{

    @Inject
    private EvenementDAO evenementDAO;


    public List<Evenement> findByTitle(String title) {
        return evenementDAO.findByTitle(title);
    }

    public void saveEvenement(Evenement evenement) {
        evenementDAO.save(evenement);
    }

    public List<Evenement> findAll() {
        return evenementDAO.findAll();
    }


    public void deleteEvenement(long id) {

    }


}
