package RestAssuredHomework;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Get {

    @Test
    public void VerifyGet() {
        RestAssured.baseURI = "https://bookstore.toolsqa.com";
        Response response = RestAssured
                .given()
                .when()
                .get("/BookStore/v1/Books")
                .then()
                .extract().response();
        int statusCode = response.getStatusCode();
        System.out.println("Statuse Code:" + statusCode);

        Assert.assertEquals(statusCode, 200, "Status Code is not 200!");

        String firstAuthor = response.jsonPath().getString("books[0].author");
        System.out.println("First book  author:" + firstAuthor);
        String firstPublisher = response.jsonPath().getString("books[0].author");
        System.out.println("First book publisher:" + firstPublisher);

        Assert.assertNotNull(firstAuthor, "Null");
        Assert.assertNotNull(firstPublisher, "Null");
    }

}

