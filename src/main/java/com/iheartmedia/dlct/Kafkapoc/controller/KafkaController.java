package com.iheartmedia.dlct.Kafkapoc.controller;

import com.iheartmedia.dlct.Kafkapoc.models.SimpleModel;
import com.iheartmedia.dlct.Kafkapoc.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    @Autowired
    private final Producer producer;

    @Autowired
    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody SimpleModel message){
        this.producer.sendMessage(message);
    }

}
