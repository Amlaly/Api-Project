import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetUserB {
    @Test(dependsOnMethods = {"CreateUserB"})
    public void GetB() {
        given().baseUri("https://654b440b5b38a59f28eec57f.mockapi.io/api/v1")
                .contentType(ContentType.JSON)
                .when().get("/users/8")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("username", equalTo("larien ahmed"))
                .assertThat().body("Job", equalTo("designer"))
                .assertThat().body("country", equalTo("italy"));
    }
}