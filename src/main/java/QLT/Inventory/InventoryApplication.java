package QLT.Inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//@SpringBootApplication: Marca la clase de configuración principal y arranca la
// auto-configuración de Spring Boot, el escaneo de componentes, y más.
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}
}