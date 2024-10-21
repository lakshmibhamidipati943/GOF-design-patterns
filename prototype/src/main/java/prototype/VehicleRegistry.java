package prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

	private static Map<String, Vehicle> mapVehicles=new HashMap<>();
	static {
		mapVehicles.put("TWO", new TwoWheelerVehicle("120","royal",100000,false));
		mapVehicles.put("Four", new FourWheelerVehicle("120","bmw",false,10000000, false));
	}
	public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException{
		return mapVehicles.get(vehicle).clone();
	}
}
