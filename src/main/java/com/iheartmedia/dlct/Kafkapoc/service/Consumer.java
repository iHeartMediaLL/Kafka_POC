package com.iheartmedia.dlct.Kafkapoc.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume(String message){
        System.out.println(String.format("$$ -> Consumed Message -> %s", message));
    }
}
