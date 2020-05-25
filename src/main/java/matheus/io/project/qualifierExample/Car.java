package matheus.io.project.qualifierExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("carBean")
public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start car");
	}

	@Override
	public void stop() {
		System.out.println("Stop car");
	}

}
