import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoApiTest {

    @Test
    public void testGetRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .contentType("application/json; charset=UTF-8")
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostRawText() {
        String requestBody = "{test:value}";
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json; charset=UTF-8")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }

    @Test
    public void testPostFormData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void testPutRequest() {
        String response = "This is expected to be sent back as part of response body.";
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json; charset=UTF-8")
                .body(response)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(response));
    }

    @Test
    public void testPatchRequest() {
        String response = "This is expected to be sent back as part of response body.";
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json; charset=UTF-8")
                .body(response)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("data", equalTo(response));
    }

    @Test
    public void testDeleteRequest() {
        String response = "This is expected to be sent back as part of response body.";
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json; charset=UTF-8")
                .body(response)
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("data", equalTo(response));
    }
}
