package com.vigilantex.springboot.controllers;

import com.vigilantex.springboot.kafka.KafkaProducer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaRestController
{
    @Autowired
    private KafkaProducer kafkaProducer;

    private static final Logger logger=LogManager.getLogger(KafkaProducer.class);

    @GetMapping("send")
    public void sendMessageToKafka(@RequestParam("mssg") String mssg)
    {
        logger.info("inside sendMessageToKafka with message value "+mssg);
        kafkaProducer.sendMessage(mssg);
    }

}
