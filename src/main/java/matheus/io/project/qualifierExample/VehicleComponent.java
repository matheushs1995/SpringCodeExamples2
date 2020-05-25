package matheus.io.project.qualifierExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleComponent {
	
	@Autowired
	@Qualifier("carBean")
	public Vehicle vehicle;
	
	public void service() {
		vehicle.start();
		vehicle.stop();
	}
}
