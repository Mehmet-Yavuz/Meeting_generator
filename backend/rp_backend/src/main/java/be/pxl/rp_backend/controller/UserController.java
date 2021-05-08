package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String GET_URL = "https://api.zoom.us/v2/users/me/";

    @GetMapping(path = "/me")
    public UserDTO loadMe() {
        UserDTO response = restTemplate.getForObject(GET_URL, UserDTO.class);
        return response;
    }
}
