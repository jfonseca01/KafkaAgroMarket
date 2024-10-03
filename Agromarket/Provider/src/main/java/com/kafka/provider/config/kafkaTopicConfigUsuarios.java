package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Cleanup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import java.util.HashMap;
import java.util.Map;

/* 
@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic generateTopic(){
        
        Map<String, String> configurations = new HashMap<>();
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);//DELETE BORRA MENSAJE, COMPACT(MANTIENE EL MSJ ACTUAL)
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");//tiempo de retencion de mensajes
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");//tamaño maximo del segmento 1gb
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");//tamaño maximo de cada mensaje 1mb por defecto
        
        return TopicBuilder.name("GestiondeProductos")
            .partitions(2)
            .replicas(2)
            .configs(configurations)
            .build();
    }
}
*/
/* 
@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic generateTopic(){
        
        Map<String, String> configurations = new HashMap<>();
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);//DELETE BORRA MENSAJE, COMPACT(MANTIENE EL MSJ ACTUAL)
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");//tiempo de retencion de mensajes
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");//tamaño maximo del segmento 1gb
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");//tamaño maximo de cada mensaje 1mb por defecto
        
        return TopicBuilder.name("GestiondeUsuario")
            .partitions(2)
            .replicas(2)
            .configs(configurations)
            .build();
    }
}
*/
/* 
@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic generateTopic(){
        
        Map<String, String> configurations = new HashMap<>();
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);//DELETE BORRA MENSAJE, COMPACT(MANTIENE EL MSJ ACTUAL)
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");//tiempo de retencion de mensajes
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");//tamaño maximo del segmento 1gb
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");//tamaño maximo de cada mensaje 1mb por defecto
        
        return TopicBuilder.name("ProcesamientodePedidos")
            .partitions(2)
            .replicas(2)
            .configs(configurations)
            .build();
    }
}
*/

@Configuration
public class kafkaTopicConfig {
    @Bean
    public NewTopic generateTopic(){
        
        Map<String, String> configurations = new HashMap<>();
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);//DELETE BORRA MENSAJE, COMPACT(MANTIENE EL MSJ ACTUAL)
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");//tiempo de retencion de mensajes
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");//tamaño maximo del segmento 1gb
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");//tamaño maximo de cada mensaje 1mb por defecto
        
        return TopicBuilder.name("MonitoreodeTransacciones")
            .partitions(2)
            .replicas(2)
            .configs(configurations)
            .build();
    }
}