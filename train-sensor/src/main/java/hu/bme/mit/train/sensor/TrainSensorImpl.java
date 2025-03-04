package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private TrainUser user;
	private int speedLimit = 5;

	public TrainSensorImpl(TrainController controller, TrainUser user) {
		this.controller = controller;
		this.user = user;
	}

	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}

	@Override
	public void overrideSpeedLimit(int speedLimit) {
		user.setAlarmState(speedLimit> 500|| speedLimit<0|| speedLimit<this.speedLimit*0.5); 

		this.speedLimit = speedLimit;
		controller.setSpeedLimit(speedLimit);
		
	}

	public void helloWorld(){
		System.out.println("Hello World");
	}

}
