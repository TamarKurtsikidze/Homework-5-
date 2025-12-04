package RestAssuredHomework;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Post {
    @Test
    public void createNewUser() {
        RestAssured.baseURI = "https://bookstore.toolsqa.com";
        JSONObject requestBody = new JSONObject();
        requestBody.put("userName", "TakoTestin");
        requestBody.put("password", "TakoTest&123");

        Response response = given()
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .post("/Account/v1/User")
                .then()
                .extract().response();
        int statusCode = response.getStatusCode();
        System.out.println(("Status Code:" + statusCode));

        String responseBody = response.getBody().asString();
        System.out.println("Response Body:" + responseBody);

        Assert.assertEquals(statusCode, 201, "Status code is not 201!");
        Assert.assertTrue(responseBody.contains("userID"), "Response body doesn't contain userID");
    }

    @Test
    public void checkMessageForWrongPassword() {
        RestAssured.baseURI = "https://bookstore.toolsqa.com";
        JSONObject requestBody = new JSONObject();
        requestBody.put("userName", "TakoTestin");
        requestBody.put("password", "TakoTest");

        Response response = given()
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .post("/Account/v1/User")
                .then()
                .extract().response();

        int statusCode = response.getStatusCode();
        System.out.println(("Status Code:" + statusCode));

        String responseBody = response.getBody().asString();
        System.out.println(("Response Body:" + responseBody));

        Assert.assertEquals(statusCode, 400, "Status code is not 400!");
        Assert.assertTrue(responseBody.contains("message"), "Response body doesn't contain message");
    }

}
