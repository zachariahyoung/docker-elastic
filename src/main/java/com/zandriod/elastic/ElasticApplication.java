package com.zandriod.elastic;

import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElasticApplication extends FatJarRouter {

    @Override
    public void configure() throws Exception {

        from("timer://trigger")
                .transform()
                .simple("ref:myBean")
                .bean("personService");

    }

    @Bean
    public String myBean() {
        return "Zach";
    }
}
