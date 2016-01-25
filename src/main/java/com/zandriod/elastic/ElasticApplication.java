package com.zandriod.elastic;

import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticApplication extends FatJarRouter {

	@Override
	public void configure() throws Exception {

				from("weather:foo?appid=44db6a862fba0b067b1930da0d769e98").routeId("weather")
				.to("elasticsearch://weather-indexer?operation=INDEX&indexName=weather&indexType=72764&transportAddresses=localhost:9300");

	}
}
