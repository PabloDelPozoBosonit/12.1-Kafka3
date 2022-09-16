package FormacionBackend2.Kafka2.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerKafka {

    //En esta clase Listener nos suscribimos a topic2
    @KafkaListener(topics = "topic2", groupId = "2")
    public String listenTopic(String message) {

        System.out.println("Message recived :) this is the message : " + message);
        return "Message recived :) this is the message : " + message;

    }

}
