import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class PostUserA {
    @Test(dependsOnMethods = {"GetoneUser"})
    public void CreateUserA() {
        String body = "{\n" +
                "\"username\": \"Aml Ali\",\n" + "\"country\": \"Egypt\",\n" +
                "\"Job\": \"Analyst\",\n" +
                "\"CreatedAt\": \"2023-12-09T16:59:39.319Z\",\n" +
                "\"id\": \"7\"\n" + "}";
        given().baseUri("https://654b440b5b38a59f28eec57f.mockapi.io/api/v1")
                .contentType(ContentType.JSON).body(body).log().all()
                .when().post("/users")
                .then().log().all()
                .statusCode(201);
    }
}
