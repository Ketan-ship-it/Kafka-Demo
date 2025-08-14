package com.Technologies.learnKafka.notification_service.consumer;

import com.Technologies.learnKafka.event.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserConsumer {

    @KafkaListener(groupId = "notification-service",topics = "user-created-topic")
    public void handleUserCreated(UserCreatedEvent userCreatedEvent) {
        log.info("handleUserCreated: {}", userCreatedEvent);
    }

    @KafkaListener(groupId = "notification-service",topics = "user-random-topic")
    public void handleUserRandomTopic1(String message) {

        log.info("handleUserRandomTopic1:  {}", message);
    }

}
