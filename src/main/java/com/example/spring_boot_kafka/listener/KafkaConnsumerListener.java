package com.example.spring_boot_kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConnsumerListener {
    @KafkaListener (topics= "demo-topic", groupId="demo-group")
            public void consume(String message){
        System.out.println("Consumed message"+message);
    }
}
