package service.impl;


import hei.tp06.core.dao.EvenementDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import service.EvenementService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.security.SecureRandom;
import java.util.*;

@Named
@Transactional
public class DataBaseInitializer {

    private final static Logger LOGGER = LoggerFactory.getLogger(DataBaseInitializer.class);

    private static Random random = new SecureRandom();

    private static String[] allProduits = new String[] { "pomme", "tomate", "poire", "carotte", "cornichon", "kiwi", "ananas", "courgette", "aubergine", "patate" };

    @Inject
    private EvenementService clientService;

    @Inject
    private EvenementDAO clientDAO;


    @PostConstruct
    public void init()
    {

    }
}
