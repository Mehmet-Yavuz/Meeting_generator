package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.ZoomApiIntegration;
import be.pxl.rp_backend.dto.AuthDTO;
import be.pxl.rp_backend.dto.UserDTO;
import be.pxl.rp_backend.entity.ZoomUrl;
import be.pxl.rp_backend.exception.InvalidInputException;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
            throw new InvalidInputException("No authorization code found.");
        }
        return newTokenResponse;
    }

    @GetMapping("/me/{accessToken}")
    public UserDTO getMe(@PathVariable String accessToken) {
        UserDTO newTokenResponse = apiIntegration.callCurrentUserApi(accessToken);
        if (isNull(newTokenResponse)) {
            throw new InvalidInputException("No authorization code found.");
        }
        return newTokenResponse;
    }

}
