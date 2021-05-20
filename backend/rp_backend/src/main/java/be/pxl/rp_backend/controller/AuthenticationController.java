package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.ZoomApiIntegration;
import be.pxl.rp_backend.dto.AuthDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private ZoomApiIntegration apiIntegration;

    @GetMapping("/access-token/{accessToken}")
    public AuthDTO getToken(@PathVariable String accessToken) {
        AuthDTO newTokenResponse = apiIntegration.callTokenApi(accessToken);
        if (isNull(newTokenResponse)) {
            throw new RuntimeException("No authorization code found.");
        }
        return newTokenResponse;
    }

}
