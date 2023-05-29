package org.casino.quarkus;

import java.util.List;

import org.casino.quarkus.model.QuarkusGame;
import org.casino.quarkus.service.QuarkusGameService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/casino")
@Produces(MediaType.APPLICATION_JSON)
public class CasinoApp {
    @Inject
    private QuarkusGameService gameService;

    @Path("/hello")
    @GET
    public String hello() {
        return "Hello from Pokerstars boss";
    }
    
    @Path("games")
    @GET
    public List<QuarkusGame> getGames(){
        return gameService.getGames();
    }
    
    @Path("game/{id}")
    @GET
    public QuarkusGame getGame(@PathParam("id") String gameId) {
        return gameService.getGame(gameId);
    }
    
}
