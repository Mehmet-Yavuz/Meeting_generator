package be.pxl.rp_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RpBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpBackendApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {return builder.build();  }
	@Bean
	public WebClient getWebClient() {
		return (WebClient.builder().build());
	}
}
