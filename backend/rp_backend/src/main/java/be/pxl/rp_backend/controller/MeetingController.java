package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.ZoomApiIntegration;
import be.pxl.rp_backend.dto.MeetingDTO;
import be.pxl.rp_backend.dto.MeetingListDTO;
import be.pxl.rp_backend.dto.PostMeetingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.ClientResponse;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/meeting")
public class MeetingController {

    @Autowired
    private ZoomApiIntegration apiIntegration;

    @GetMapping(path = "/scheduled/{accessTokenString}")
    public MeetingListDTO loadMeeting(@PathVariable String accessTokenString) {
        MeetingListDTO response = apiIntegration.callMeetingApi(accessTokenString);
        if (isNull(response)) {
            throw new RuntimeException("Something went wrong while retrieving meetings.");
        }
        return response;
    }

    @PostMapping(path = "/create/{accessTokenString}")
    public MeetingDTO createMeeting(@RequestBody PostMeetingDTO meeting , @PathVariable String accessTokenString) {
        MeetingDTO response = apiIntegration.callCreateMeetingApi(meeting ,accessTokenString);
        if (isNull(response)) {
            throw new RuntimeException("Something went wrong while creating the meeting.");
        }
        return response;
    }
}
