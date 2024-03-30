package com.shazahmed.notificationservice.kafkaconsumers.paymentservice;

import org.springframework.kafka.annotation.KafkaListener;

public class Consumer {

    @KafkaListener(topics = "baeldung", groupId = "foo")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
