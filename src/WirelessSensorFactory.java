//Wireless sensor factory
public class WirelessSensorFactory implements ISensorFactory {
	
	public WirelessSensorFactory(){
		System.out.println("WIRELESS Sensor Factory \n =======================");
	}
	
	public IHeaterSensor createHeaterSensor(){
		return new WirelessHeaterSensor();
	}
	
	public IDoorSensor createDoorSensor(){
		return new WirelessDoorSensor();
	}

}
