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
		car.setColor("Black");
		car.setMiles(45020);
		car.setVIN("033-CQK");
		
		return new ResponseEntity<Car>(car, HttpStatus.OK);
	}
}
