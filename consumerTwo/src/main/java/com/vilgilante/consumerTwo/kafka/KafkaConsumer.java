package com.vilgilante.consumerTwo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer
{

    @KafkaListener(topics = "javaguides",groupId = "my-group-two")
    public void messageConsuner(String mssg)
    {

        System.out.println(mssg);
    }

}
