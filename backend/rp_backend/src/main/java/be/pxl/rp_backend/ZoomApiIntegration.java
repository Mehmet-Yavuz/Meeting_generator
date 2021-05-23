package be.pxl.rp_backend;

import be.pxl.rp_backend.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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

        String zoomUrl ="/oauth/token?grant_type=authorization_code&code={oAuthCode}&redirect_uri={redirectUrl}";
        zoomUrl = zoomUrl.replace("{oAuthCode}", oAuthToken);
        zoomUrl = zoomUrl.replace("{redirectUrl}", applicationProperties.getRedirectUrl());

        ClientResponse clientResponse = webClient.post()
                .uri(zoomUrl)
                .header(HttpHeaders.AUTHORIZATION, authorizationToken)
                .exchange()
                .block();

        Mono<AuthDTO> tokenResponseMono = clientResponse.bodyToMono(AuthDTO.class);
        AuthDTO newTokenResponse = tokenResponseMono.block();
        return newTokenResponse;
    }

    public UserDTO callCurrentUserApi(String accessToken) {
        String authorizationToken = "Bearer " + accessToken;

        String userZoomDetailsUrl = "/v2/users/me/";
        ClientResponse clientResponse = webClient.get()
                .uri(userZoomDetailsUrl)
                .header(HttpHeaders.AUTHORIZATION, authorizationToken)
                .exchange()
                .block();

        Mono<UserDTO> personalDetailsResponseMono = clientResponse.bodyToMono(UserDTO.class);
        UserDTO newPersonalDetailsResponse = personalDetailsResponseMono.block();

        return newPersonalDetailsResponse;
    }

    public MeetingListDTO callMeetingApi(String accessToken) {
        String authorizationToken = "Bearer " + accessToken;

        String meetingsZoomDetailsUrl = "/v2/users/me/meetings";

        ClientResponse clientResponse = webClient.get()
                .uri(uriBuilder ->  uriBuilder.path(meetingsZoomDetailsUrl)
                        .queryParam("type","scheduled")
                        .queryParam("page_size","30")
                        .queryParam("next_page_token","")
                        .queryParam("page_number","").build())
                .header(HttpHeaders.AUTHORIZATION, authorizationToken)
                .exchange()
                .block();

        Mono<MeetingListDTO> meetingResponseMono = clientResponse.bodyToMono(MeetingListDTO.class);
        MeetingListDTO newMeetingResponse = meetingResponseMono.block();

        return newMeetingResponse;
    }

    public MeetingDTO callCreateMeetingApi(PostMeetingDTO meeting, String accessToken) {
        String authorizationToken = "Bearer " + accessToken;

        String meetingsZoomDetailsUrl = "/v2/users/me/meetings";

        ClientResponse clientResponse = webClient.post()
                .uri(meetingsZoomDetailsUrl)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .header(HttpHeaders.AUTHORIZATION, authorizationToken)
                .body(Mono.just(meeting), PostMeetingDTO.class)
                .exchange()
                .block();

        Mono<MeetingDTO> meetingResponseMono = clientResponse.bodyToMono(MeetingDTO.class);
        MeetingDTO createMeetingResponse = meetingResponseMono.block();

        return createMeetingResponse;
    }
}
