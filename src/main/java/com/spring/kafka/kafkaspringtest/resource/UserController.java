package com.spring.kafka.kafkaspringtest.resource;


import com.spring.kafka.kafkaspringtest.kafka.Producer;
import com.spring.kafka.kafkaspringtest.modules.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class UserController {


    @Autowired
    private Producer producer;

    @PostMapping("/publish")
    public String post(@RequestBody AppUser appUser){
        producer.PublishToTopic(appUser);
        return "Published successfully";
    }



}
