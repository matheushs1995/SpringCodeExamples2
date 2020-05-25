package matheus.io.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import matheus.io.project.qualifierExample.VehicleComponent;

@SpringBootApplication
@ComponentScan(basePackages = {"matheus.io.project","matheus.io.project.qualifierExample", "matheus.io.project.profileExample", "matheus.io.project.applicationPropertiesExample"})
public class SpringCodeExamples2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringCodeExamples2Application.class, args);

		VehicleComponent component = (VehicleComponent) ctx.getBean("vehicleComponent");
		component.service();

	}

}
