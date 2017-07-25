package academy.dd.fibonacci.rest;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import academy.dd.fibonacci.jetty.EmbeddedJetty;


public class StopFibSeq {

			
	@Test
     public void StopFebSeq() {
         given().when().get("http://localhost:7003/fib").then().statusCode(200);
             
	 	 
	 }

    }
	

