package com.careerconnect.activityservices.controller;


import com.careerconnect.activityservices.dto.ActivityRequest;
//import com.careerconnect.activityservices.dto.ActivityResponse;
import com.careerconnect.activityservices.dto.ActivityResponse;
import com.careerconnect.activityservices.service.ActivityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activities")
@AllArgsConstructor
public class ActiviityController {
    private ActivityService activityService;

    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity(@RequestBody ActivityRequest request) {
        return ResponseEntity.ok(activityService.trackActivity(request));
    }
}
