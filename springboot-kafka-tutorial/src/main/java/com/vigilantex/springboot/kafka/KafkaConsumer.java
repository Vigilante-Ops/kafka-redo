package com.vigilantex.springboot.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer
{

    @KafkaListener(topics = "javaguides",groupId = "my-group")
    public void messageConsuner(String mssg)
    {

        System.out.println(mssg);
    }

}
