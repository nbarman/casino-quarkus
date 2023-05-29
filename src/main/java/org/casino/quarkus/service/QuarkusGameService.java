package org.casino.quarkus.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
 
 public QuarkusGame getGame(String id) {
   //  int gameId = Integer.parseInt(id);
    // return Optional.ofNullable(qGame).orElse(new QuarkusGame(30, "Temple Run", 4, "race"));
     return qGame;
 }
}
