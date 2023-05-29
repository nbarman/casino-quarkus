package org.casino.quarkus;

import io.netty.handler.codec.http.CombinedHttpHeaders;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CasinoAppTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("casino/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from Pokerstars"));
    }
    
    @Test
    public void testGetGames() {
        given()
               .header(HttpHeaders.ACCEPT,MediaType.APPLICATION_JSON)
               .when().get("casino/game/1")
               .then()
               .statusCode(200)
               .body("gameName", is("BlackJack".trim()));          
    }

}