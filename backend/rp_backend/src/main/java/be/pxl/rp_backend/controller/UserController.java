package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.ZoomApiIntegration;
import be.pxl.rp_backend.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ZoomApiIntegration apiIntegration;

    @GetMapping("/me/{accessToken}")
    public UserDTO getMe(@PathVariable String accessToken) {
        UserDTO userResponse = apiIntegration.callCurrentUserApi(accessToken);
        if (isNull(userResponse)) {
            throw new RuntimeException("Something went wrong while retrieving user.");
        }
        return userResponse;
    }
}
