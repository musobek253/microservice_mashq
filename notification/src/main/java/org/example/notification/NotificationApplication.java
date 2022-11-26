package org.example.notification;

import org.example.rabbit.RabbitMQMessageProducer;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
        scanBasePackages = {
                "org.example.rabbit",
                "org.example.notification"
        }
)
@EnableRabbit
@EnableEurekaClient
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class,args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMQMessageProducer producer,NotificationConfig notificationConfig){
//        return args -> {
//            producer.publish("foo",notificationConfig.getInternalExchange(), notificationConfig.getInternalNotificationRoutingKey());
//        };
//
//    }

}
