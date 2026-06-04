package com.javabasic.java11features.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSynchDemo {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
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

		HttpResponse<String> response1 = client.send(request, BodyHandlers.ofString());

		System.out.println("Status===> " + response1.statusCode());
		System.out.println(response1.body());

		HttpHeaders headers = response1.headers();
		System.out.println(headers.map());
	}
}
