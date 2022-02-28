package hu.bme.mit.train.tachograph;

import hu.bme.mit.train.system.TrainSystem;
import hu.bme.mit.train.controller.TrainController;
import hu.bme.mit.train.user.TrainUser;
import com.google.common.collect.*;


public class Tachograph{
	private TrainSystem trainSystem = new TrainSystem;

	private Table<Integer, Integer, Integer> records = HashBasedTable.create();

	public void record(int time)
	{
		records.put(time, TrainSystem.getUser().getJoystickPosition(), TrainSystem.getController().getReferenceSpeed());
	}

}
