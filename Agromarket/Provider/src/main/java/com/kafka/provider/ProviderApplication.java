package com.kafka.provider;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;


@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) {SpringApplication.run(ProviderApplication.class, args);}

	@Bean
	CommandLineRunner init(KafkaTemplate<String, String> kafkaTemplate) {
		return args-> {
			//kafkaTemplate.send( "GestiondeProductos", "Hay solicitud de producto" );
			//kafkaTemplate.send( "GestiondeProductos", "Hay solicitud de agregar nuevo producto" );
			//kafkaTemplate.send( "GestiondeUsuario", "Hay solicitud de agregar nuevo Usuario" );
			//kafkaTemplate.send( "GestiondeUsuario", "El usuario ha sido eliminado" );
			kafkaTemplate.send( "ProcesamientodePedidos", "Se genera orden de compra No: 123456778");
			kafkaTemplate.send( "ProcesamientodePedidos", "El cliente ha hecho cambios en el pedido, ha reemplazado el producto id=1234 por producto id=5678");
			//kafkaTemplate.send( "MonitoreodeTransacciones", "Transaccion exitosa, el pago ha sido aprobado");
			//kafkaTemplate.send( "MonitoreodeTransacciones", "Transaccion rechazada");

		};
		
	}

}


