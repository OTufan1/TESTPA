package utilities.apiUtilities;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
public class Authentication {
    public static String token(String email, String password){
        String url = "";
        //String body = "{"email": ""+email+"","password": ""+password+""}";

        return given()
                .when()
               // .body(body)
                .contentType(ContentType.JSON)
                .post(url)
                .jsonPath()
                .getString("token");
    }
}
