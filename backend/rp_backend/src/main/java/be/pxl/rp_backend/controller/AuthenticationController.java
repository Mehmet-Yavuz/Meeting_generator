package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.ZoomApiIntegration;
import be.pxl.rp_backend.dto.AuthDTO;
import be.pxl.rp_backend.exception.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private ZoomApiIntegration apiIntegration;

    @GetMapping(path = "/token")
    public AuthDTO getToken(String oAuth) {
        AuthDTO newTokenResponse = apiIntegration.callTokenApi(oAuth);
        if (isNull(newTokenResponse)) {
            throw new InvalidInputException("No authorization code found.");
        }
        return newTokenResponse;
    }
}
