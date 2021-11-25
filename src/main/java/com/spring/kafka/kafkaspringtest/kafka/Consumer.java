package com.spring.kafka.kafkaspringtest.kafka;


import com.spring.kafka.kafkaspringtest.modules.AppUser;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "Kafka_Example",groupId = "mygroup")
    public void consumerFromTopic(AppUser appUser){
        System.out.println("consumed message : "+appUser);
    }

}
