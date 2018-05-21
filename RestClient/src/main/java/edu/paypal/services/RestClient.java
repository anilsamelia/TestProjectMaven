package edu.paypal.services;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import edu.paypal.Product;
import edu.paypal.ResponseList;

public class RestClient {

	public static void addProduct(){
		ClientBuilder clientbuilder = ClientBuilder.newBuilder();
		Client client=clientbuilder.build();
		WebTarget target=client.target("http://localhost:8080/RestFull/rest/product/all");
		ResponseList responselist=target.request().get(ResponseList.class);
		System.out.println(responselist);
		
	}
	
	
	
	public static void main(String[] args) {
		addProduct();
	}

}
