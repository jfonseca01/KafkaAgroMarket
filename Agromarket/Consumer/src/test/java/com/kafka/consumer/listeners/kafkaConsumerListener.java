package com.kafka.consumer.listeners;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaConsumerListener {
    private Logger LOGGER = LoggerFactory.getLogger(kafkaConsumerListener.class);

    @KafkaListener(topics = {"GestiondeProductos", "GestiondeUsuario", "ProcesamientodePedidos", "MonitoreodeTransacciones"}, groupId = "Agromarket")
    public void listener(String message){
        LOGGER.info("Mensaje Recibido, el mensaje es: "+ message);

    }
}
