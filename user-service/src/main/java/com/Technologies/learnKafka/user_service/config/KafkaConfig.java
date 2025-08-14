package com.Technologies.learnKafka.user_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Value("${kafka.topic.user-random-topic}")
    private String My_Random_KAFKA_TOPIC;

    @Value("${kafka.topic.user-created-topic}")
    private String My_Created_KAFKA_TOPIC;

    @Bean
    public NewTopic randomUserTopic(){
        return new NewTopic(My_Random_KAFKA_TOPIC ,3,(short)1);
    }

    @Bean
    public NewTopic createdUserTopic(){
        return new NewTopic(My_Random_KAFKA_TOPIC ,3,(short)1);
    }

}
