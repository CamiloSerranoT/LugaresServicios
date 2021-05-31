package edu.ucentral.servicio.actividades;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EntityScan({"edu.ucentral.common.lugares.model","edu.ucentral.servicio.actividades.model"})
@EnableEurekaClient
@SpringBootApplication
public class ServicioActividadesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioActividadesApplication.class, args);
	}

}
