package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredd {

	@Test
	public void get()
	{
		RestAssured.baseURI="https://reqres.in";
		RequestSpecification requestt = RestAssured.given();
		Response responsee = requestt.request(Method.GET, "/api/users/3");
		String responsebody = responsee.getBody().asString();
		System.out.println("Response body is : " + responsebody);
		int code=responsee.getStatusCode();
		System.out.println("Status code : "+ code);
		
		
	}
}
