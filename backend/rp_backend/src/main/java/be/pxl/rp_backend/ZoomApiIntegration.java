package be.pxl.rp_backend;

import be.pxl.rp_backend.dto.AuthDTO;
import be.pxl.rp_backend.dto.UserDTO;
import be.pxl.rp_backend.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Base64;

@Component
public class ZoomApiIntegration {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Autowired
    private  WebClient webClient;

    public AuthDTO callTokenApi(String oAuthToken) {

        String originalString = applicationProperties.getClientId() + ":" + applicationProperties.getClientSecret();

        String authorizationToken = "Basic " + Base64.getEncoder().encodeToString(originalString.getBytes());

        String zoomUrl ="https://api.zoom.us/oauth/token?grant_type=authorization_code&code={oAuthCode}&redirect_uri={redirectUrl}";
        zoomUrl = zoomUrl.replace("{oAuthCode}", oAuthToken);
        zoomUrl = zoomUrl.replace("{redirectUrl}", applicationProperties.getRedirectUrl());

        ClientResponse clientResponse = webClient.post()
                .uri(zoomUrl)
                .header(HttpHeaders.AUTHORIZATION, authorizationToken)
                .exchange()
                .block();

        if (clientResponse.statusCode().isError()) {
            throw new ResourceNotFoundException("Failed to generate token.");
        }

        Mono<AuthDTO> tokenResponseMono = clientResponse.bodyToMono(AuthDTO.class);
        AuthDTO newTokenResponse = tokenResponseMono.block();
        return newTokenResponse;
    }

    public UserDTO callCurrentUserApi(String accessToken) {
        String authorizationToken = "Bearer " + accessToken;

        String userZoomDetailsUrl = "https://api.zoom.us/v2/users/me/";
        ClientResponse clientResponse = webClient.get()
                .uri(userZoomDetailsUrl)
                .header(HttpHeaders.AUTHORIZATION, authorizationToken)
                .exchange()
                .block();

        Mono<UserDTO> personalDetailsResponseMono = clientResponse.bodyToMono(UserDTO.class);
        UserDTO newPersonalDetailsResponse = personalDetailsResponseMono.block();

        return newPersonalDetailsResponse;
    }
}
