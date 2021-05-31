package edu.ucentral.servicio.citas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EntityScan({"edu.ucentral.common.lugares.model","edu.ucentral.common.usuarios.model","edu.ucentral.servicio.citas.model"})
@EnableEurekaClient
@SpringBootApplication
public class ServicioCitasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioCitasApplication.class, args);
	}

}
