import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.response.ValidatableResponse.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class GetUserA {
    @Test(dependsOnMethods = {"CreateUserA"})
    public void GetA() {
        given().baseUri("https://654b440b5b38a59f28eec57f.mockapi.io/api/v1")
                .contentType(ContentType.JSON)
                .when().get("/users/7")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("username", equalTo("Aml Ali"))
                .assertThat().body("Job", equalTo("Analyst"))
                .assertThat().body("country", equalTo("Egypt"));
    }
}