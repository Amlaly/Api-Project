import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class GetOneOfUsers {
    @Test(dependsOnMethods = {"Getallusers"})
    public void GetoneUser()
    {
        given().baseUri("https://654b440b5b38a59f28eec57f.mockapi.io/api/v1")
                .contentType(ContentType.JSON)
                .when().get("/users/3")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("username",equalTo("Valerie Wisoky DVM"))
                .assertThat().body("Job",equalTo("Future Tactics Facilitator"))
                .assertThat().body("country",equalTo("Venezuela"));
    }
}
