package hei.tp06.web.controller.impl;

import hei.tp06.core.entity.Evenement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.EvenementService;
import service.impl.EvenementServiceImpl;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by N0stress on 14/02/2017.
 */

@Named
@Path("/evenements")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MainController {

        private static final Logger logger = LoggerFactory.getLogger(MainController.class);

        @Inject
        private EvenementService evenement;

        @GET
        @Path("/evenements/")
        public List<Evenement> getEvenement(){
        //logger.info("Demande de l'evenement courant avec la clé {}", id);
        return evenement.findAll();
        }

        @GET
        @Path("/tp06‐web/api/evenements/{id}")
        public List<Evenement> getCurrentEvenement(@PathParam("id") long id){
            logger.info("Demande de l'evenement courant avec la clé {}", id);
            return evenement.findById(id);
        }

}
