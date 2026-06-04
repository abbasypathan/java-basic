package com.javabasic.java11features.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientASynchDemo {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/activities/"))
				.GET().build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		System.out.println("Status===> " + response.statusCode());
		System.out.println(response.body());

		request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/activities/"))
				.POST(BodyPublishers.ofString("{\n" + " \"ID\": 0,\n" + " \"Titlel\": \"string\", \n"
						+ "\"DueDatel\": \"2020-06-24T08: 32: 49.249Z\", \n" + " \"Completed\": true\n" + "}"))
				.header("Content-Type", "application/json").build();

		// In case of Async request we will get CompletableFuture, in sometime we will get response
		CompletableFuture<HttpResponse<String>> response1 = client.sendAsync(request, BodyHandlers.ofString());
		String string = response1.thenApply(HttpResponse::body).get();

		System.out.println("Body===> " + string);
	}
}
