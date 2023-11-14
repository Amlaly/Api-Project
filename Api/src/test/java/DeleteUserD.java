import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class DeleteUserD {
    @Test(dependsOnMethods = {"PatchB"})
    public void DeleteUser(){
        given().baseUri("https://654b440b5b38a59f28eec57f.mockapi.io/api/v1")
                .when().delete("/users/4")
                .then().log().all()
                .assertThat().statusCode(404);}
}
