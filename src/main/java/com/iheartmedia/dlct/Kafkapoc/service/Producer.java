package com.iheartmedia.dlct.Kafkapoc.service;

import com.iheartmedia.dlct.Kafkapoc.models.SimpleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC = "test";

    @Autowired
    KafkaTemplate<String, SimpleModel> KafkaJsonTemplate;
    public void sendMessage(SimpleModel message){

        this.KafkaJsonTemplate.send(TOPIC, message);
    }
}
