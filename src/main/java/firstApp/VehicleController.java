package firstApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	@RequestMapping(value="/car")
	public ResponseEntity<Car> get() {
		Car car = new Car();
		car.setColor("Red");
		car.setMiles(100);
		car.setVIN("12345");
		
		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}
}
