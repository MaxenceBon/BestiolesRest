package fr.diginamic;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
public class BestiolesRestApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(BestiolesRestApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(BestiolesRestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
