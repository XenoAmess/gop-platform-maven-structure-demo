package com.xenoamess.gop.gop_auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@Slf4j
@SpringBootApplication(
        scanBasePackages = {
                "com.xenoamess.gop"
        }
)
@ConfigurationPropertiesScan
public class GopAuthApplication {

    public static void main(
            String[] args
    ) {
        SpringApplication.run(
                GopAuthApplication.class,
                args
        );
    }

}
