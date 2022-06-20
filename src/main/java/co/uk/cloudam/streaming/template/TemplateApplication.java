package co.uk.cloudam.streaming.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.uk.cloudam.streaming.springcommon.config",
                               "co.uk.cloudam.streaming.springcommon.auth",
                               "co.uk.cloudam.streaming.template"})
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

}
