package org.casino.quarkus.service;

import java.util.ArrayList;
import java.util.List;

import org.casino.quarkus.model.QuarkusGame;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class QuarkusGameService {

private QuarkusGame qGame;


 QuarkusGameService(QuarkusGame qGame){
     this.qGame= qGame;
     qGame.setGameId(21);
     qGame.setGameName(new String("BlackJack").trim());
     qGame.setTableId(1);
 }
 
 public List<QuarkusGame> getGames(){
     List<QuarkusGame> gameList = new ArrayList<QuarkusGame>();
     gameList.add(qGame);
     return gameList;
 }
}
