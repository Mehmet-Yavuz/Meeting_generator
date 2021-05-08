package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.dto.MeetingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/meeting")
public class MeetingController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String POST_URL = "https://api.zoom.us/v2/users/me/";
    private static final String GET_URL = "https://api.zoom.us/v2/meetings/";

    @GetMapping(path = "/{meetingID}")
    public MeetingDTO loadMeeting(String meetingID) {
        MeetingDTO response = restTemplate.getForObject(GET_URL + meetingID, MeetingDTO.class);
        return response;
    }
}
