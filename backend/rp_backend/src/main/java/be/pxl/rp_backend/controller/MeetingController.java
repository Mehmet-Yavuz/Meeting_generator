package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.ZoomApiIntegration;
import be.pxl.rp_backend.dto.MeetingDTO;
import be.pxl.rp_backend.dto.MeetingListDTO;
import be.pxl.rp_backend.dto.PostMeetingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.isNull;

@RestController
@RequestMapping("/meeting")
public class MeetingController {

    @Autowired
    private ZoomApiIntegration apiIntegration;

    @GetMapping(path = "/scheduled/{accessToken}")
    public MeetingListDTO loadMeeting(@PathVariable String accessToken) {
        MeetingListDTO response = apiIntegration.callMeetingApi(accessToken);
        if (isNull(response)) {
            throw new RuntimeException("Something went wrong while retrieving meetings.");
        }
        return response;
    }

    @PostMapping(path = "/create/{accessToken}")
    public MeetingDTO createMeeting(@RequestBody PostMeetingDTO meeting , @PathVariable String accessToken) {
        MeetingDTO response = apiIntegration.callCreateMeetingApi(meeting ,accessToken);
        if (isNull(response)) {
            throw new RuntimeException("Something went wrong while creating the meeting.");
        }
        return response;
    }
}
