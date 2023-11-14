import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostUserB {
    @Test(dependsOnMethods = {"UpdateUserA"})
    public void CreateUserB() {
        String body = "{\n" +"\"username\": \"larien ahmed\",\n" +
                "\"country\": \"italy\",\n" +
                "\"Job\": \"designer\",\n" +
                "\"CreatedAt\": \"2023-12-09T16:59:39.319Z\",\n" +
                "\"id\": \"8\"\n" + "}";
        given().baseUri("https://654b440b5b38a59f28eec57f.mockapi.io/api/v1")
                .contentType(ContentType.JSON).body(body).log().all()
                .when().post("/users")
                .then().log().all()
                .statusCode(201);
    }
}
