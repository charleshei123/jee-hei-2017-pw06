package hei.tp06.web.controller.impl;

import hei.tp06.core.entity.Evenement;
import hei.tp06.web.controller.RestController;
import hei.tp06.core.service.EvenementService;

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
public class MainController implements RestController {

    @Inject
    private EvenementService evenement;

    @GET
    @Path("")
    public List<Evenement> getEvenement()
    {
        return evenement.findAll();
    }

    @GET
    @Path("/{id}")
    public Evenement getEvenement(@PathParam("id") Long id) {
        return evenement.findById(id);
    }

    @POST
    @Path("")
    public void saveEvent(Evenement event) {
        evenement.saveEvenement(event);
    }

}
