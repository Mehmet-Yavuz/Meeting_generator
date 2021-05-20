package be.pxl.rp_backend.controller;

import be.pxl.rp_backend.ZoomApiIntegration;
import be.pxl.rp_backend.dto.MeetingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meeting")
public class MeetingController {

    @Autowired
    private ZoomApiIntegration apiIntegration;

    @GetMapping(path = "/{accessTokenString}")
    public MeetingDTO loadMeeting(@PathVariable String accessTokenString) {
        MeetingDTO response = apiIntegration.callMeetingApi(accessTokenString);
        return response;
    }
}
