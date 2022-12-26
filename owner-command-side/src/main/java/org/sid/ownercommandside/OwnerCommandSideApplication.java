package org.sid.ownercommandside;

import com.thoughtworks.xstream.XStream;
import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.SimpleCommandBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class OwnerCommandSideApplication {

    public static void main(String[] args) {
        SpringApplication.run(OwnerCommandSideApplication.class, args);
    }

    @Bean
    CommandBus commandBus() {
        return SimpleCommandBus.builder().build();
    }

}
