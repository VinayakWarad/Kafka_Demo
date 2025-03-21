package com.example.spring_boot_kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final String TOPIC="demo-topic";
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessages(String message){
        this.kafkaTemplate.send(TOPIC,message);
    }
}
