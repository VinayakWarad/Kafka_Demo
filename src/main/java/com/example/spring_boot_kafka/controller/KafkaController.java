package com.example.spring_boot_kafka.controller;

import com.example.spring_boot_kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/kafka")
@RestController
public class KafkaController {
    @Autowired
    KafkaProducerService kafkaProducerService;
    @PostMapping("/publish")
    public String my(@RequestParam("message") String message){
        kafkaProducerService.sendMessages(message);
      return "Message produced successfully";
    }
}
