package hei.tp06.web.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import hei.tp06.web.controller.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by N0stress on 14/02/2017.
 */
@Named
@Path("/evenement")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MainController implements RestController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Inject
    private BattleService battleService;

    @GET
    @Path("/question/{teamKey}")
    public String getCurrentChallenge(@PathParam("teamKey") String teamKey){
        logger.info("Demande du challenge courant avec la clé {}", teamKey);
        return battleService.getCurrentChallenge(teamKey);
    }

    @POST
    @Path("/answer/{teamKey}")
    public void replyToCurrentChallenge(@PathParam("teamKey") String teamKey, AnswerDTO answer){
        battleService.submitAnswer(teamKey, answer);
    }

}
