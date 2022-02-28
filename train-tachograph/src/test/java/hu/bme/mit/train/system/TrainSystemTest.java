package hu.bme.mit.train.system;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.TrainSystem;
import hu.bme.mit.train.tachograph.Tachograph;


public class TrainSystemTest {

	Tachograph tachograph;
	
	@Before
	public void before() {
		 tachograph = new Tachograph();
	}
	

	@Test(expected = Test.None.class)
	public void OverridingJoystickPositionToNegative_SetsReferenceSpeedToZero() {
			tachograph.record(10);
			tachograph.record(20);
			Assert.assertEquals(tachograph.any(), true);
	}

	
}
