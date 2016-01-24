package com.zandriod.elastic;

import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElasticApplication extends FatJarRouter {

    @Override
    public void configure() throws Exception {

//				from("weather:foo?appid=44db6a862fba0b067b1930da0d769e98").routeId("weather")
//						.streamCaching()
//				.to("elasticsearch://weather-indexer?operation=INDEX&indexName=weather&indexType=72764&transportAddresses=127.0.0.1:9300");

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
