package hu.bme.mit.train.tachograph;

import hu.bme.mit.train.system.TrainSystem;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import com.google.common.collect.*;


public class Tachograph{
	private TrainSystem trainSystem = new TrainSystem();

	private Table<Integer, Integer, Integer> records = HashBasedTable.create();

	public void record(int time)
	{
		records.put(time, trainSystem.getUser().getJoystickPosition(), trainSystem.getController().getReferenceSpeed());
	}

	public boolean any()
	{
		return !(records.isEmpty());
	}

}
