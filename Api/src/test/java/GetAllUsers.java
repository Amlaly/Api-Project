import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetAllUsers {
    @Test
    public void Getallusers()
    {
        given().baseUri("https://654b440b5b38a59f28eec57f.mockapi.io/api/v1").log().all()
                .when().get("/users")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("username",hasItem("Lynette Gibson"));
    }

}
