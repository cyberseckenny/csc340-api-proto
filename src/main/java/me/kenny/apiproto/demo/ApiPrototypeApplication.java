package me.kenny.apiproto.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPrototypeApplication.class, args);
		weather();
	}

	public static void weather() {
		String url = "https://api.weather.gov/points/36.072701,-79.793900"; // greensboro
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();

		String json = restTemplate.getForObject(url, String.class);

		System.out.println(json);
	}
}
