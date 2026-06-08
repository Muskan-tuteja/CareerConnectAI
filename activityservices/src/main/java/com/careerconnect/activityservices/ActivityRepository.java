package com.careerconnect.activityservices;


import com.careerconnect.activityservices.dto.ActivityRequest;
import com.careerconnect.activityservices.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {
}
