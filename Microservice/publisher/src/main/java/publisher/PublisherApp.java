package publisher;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class PublisherApp {
    public static void main(String[] args) {
        SpringApplication.run(PublisherApp.class,args);
    }
}
