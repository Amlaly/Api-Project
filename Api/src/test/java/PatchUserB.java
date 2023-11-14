import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static   io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class PatchUserB {
    @Test(dependsOnMethods = {"GetB"})
    public void PatchB(){
        String body=" {\n" + "\"Job\": \"accountant\"\n"+ "\n" +"}";
        given().baseUri("https://654b440b5b38a59f28eec57f.mockapi.io/api/v1")
                .contentType(ContentType.JSON).body(body).log().all()
                .when().patch("/users/8")
                .then().log().all()
                .assertThat().statusCode(200);
    }

}
