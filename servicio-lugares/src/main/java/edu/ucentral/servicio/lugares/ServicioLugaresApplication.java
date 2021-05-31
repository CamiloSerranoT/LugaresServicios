package edu.ucentral.servicio.lugares;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EntityScan({"edu.ucentral.common.lugares.model"})
@EnableEurekaClient
@SpringBootApplication
public class ServicioLugaresApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioLugaresApplication.class, args);
	}

}
