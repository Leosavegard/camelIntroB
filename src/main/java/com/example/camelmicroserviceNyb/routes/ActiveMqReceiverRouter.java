package com.example.camelmicroserviceNyb.routes;


import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder {



    @Override
    public void configure() throws Exception {
        log.info("Configuring timer route");
        from("activemq:my-activemq-queue")
                .to("log:received-message-from-active-mq?showBody=true&level=ERROR");


    }
}
