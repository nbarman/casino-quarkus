package org.casino.quarkus.model;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Data;

@Data
@ApplicationScoped
public class QuarkusGame {
    
    private int gameId;
    private String gameName;
    private int TableId;
    
    @ConfigProperty(name= "game.type", defaultValue="Casino")
    private String gType;
  /*  public String getgType() {
        return gType;
    } */

}
