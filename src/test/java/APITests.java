import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {
    @Test
    void test1()
    {
        Response resp =  get("https://reqres.in/api/users?page=2");
        System.out.println("Response: "+ resp.asString());
        System.out.println("Status Code: "+ resp.getStatusCode());
        System.out.println("Body: "+resp.getBody().asString());
        System.out.println("Time taken: "+resp.getTime());
        System.out.println("Header: "+resp.getHeader("content-type"));
        
        int statusCode = resp.getStatusCode();
        Assert.assertEquals(statusCode,200);

    }

    @Test
    void test2()
    {
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
        System.out.println("Test2 passed");
    }

    @Test
    void test3()

    {

        System.out.println(given().get("https://reqres.in/api/users/2").asString());
    }
}
