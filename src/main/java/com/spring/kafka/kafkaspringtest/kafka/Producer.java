package com.spring.kafka.kafkaspringtest.kafka;

import com.spring.kafka.kafkaspringtest.modules.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC = "Kafka_Example";

    @Autowired
    private KafkaTemplate<String, AppUser> kafkaTemplate;

    public void PublishToTopic(AppUser appUser){
        System.out.printf("Publishing to Topic"+TOPIC);
        kafkaTemplate.send(TOPIC,appUser);
    }

}
