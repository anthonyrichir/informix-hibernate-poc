package be.ari.informix.hibernate.poc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.io.IOException;

/**
 * Created by Anthony on 4/09/2016.
 */
@SpringBootApplication
public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository applRepository) {
        return (args) -> {
            PageRequest pageRequest = new PageRequest(0, 10);
            Page<Person> all1 = applRepository.findAll(pageRequest);
            all1.forEach((appl) -> log.info(appl.toString()));
            log.info("########################################################################");
            pageRequest = new PageRequest(1, 10);
            all1 = applRepository.findAll(pageRequest);
            all1.forEach((appl) -> log.info(appl.toString()));
            log.info("########################################################################");
            pageRequest = new PageRequest(2, 10);
            all1 = applRepository.findAll(pageRequest);
            all1.forEach((appl) -> log.info(appl.toString()));
        };
    }
}
