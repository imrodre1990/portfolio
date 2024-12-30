package utils;

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class apiHelper {

    public Response validatePostStatusCode(RequestSpecification reqSpec, int expectedStatusCode) {

        return responseWithStatus(reqSpec, expectedStatusCode).post();
    }

    public Response validatePutStatusCode(RequestSpecification reqSpec, int expectedStatusCode) {
        return responseWithStatus(reqSpec, expectedStatusCode).put();
    }

    public Response validateGetStatusCode(RequestSpecification reqSpec, int expectedStatusCode) {
        return responseWithStatus(reqSpec, expectedStatusCode).get();
    }

    private RequestSender responseWithStatus(RequestSpecification reqSpec, int expectedStatusCode) {
        ResponseSpecification resSpec = new ResponseSpecBuilder().expectStatusCode(expectedStatusCode).build();
        return RestAssured.given().spec(reqSpec).log().uri().log().headers().log().body().then().spec(resSpec).log()
                .status().log().body().when();
    }

    /**
     * RequestSpecification reqSpec = new RequestSpecBuilder()
     * .setBaseUri(endPoint)
     * .setBasePath(resource.getPath())
     * .setContentType(ContentType.JSON).setBody(gson.toJson(bodyReq)).build();
     * ResponseSpecification resSpec = new ResponseSpecBuilder().expectStatusCode(200).build();
     */
}
