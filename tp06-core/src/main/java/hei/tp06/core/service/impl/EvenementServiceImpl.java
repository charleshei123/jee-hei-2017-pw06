package hei.tp06.core.service.impl;

import hei.tp06.core.dao.EvenementDAO;
import hei.tp06.core.entity.Evenement;
import hei.tp06.core.service.EvenementService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;



@Named
@Transactional
public class EvenementServiceImpl implements EvenementService {

    @Inject
    private EvenementDAO evenementDAO;

    public List<Evenement> findAll() {
        return evenementDAO.findAll();
    }

    public Evenement findById(long id) {
        return evenementDAO.findById(id);
    }

    public Evenement findByTitle(String title) {
        return evenementDAO.findByTitle(title);
    }

    public void saveEvenement(Evenement evenement) {
        evenementDAO.save(evenement);
    }

    public void deleteEvenement(long id) {
        evenementDAO.delete(id);
    }
}

