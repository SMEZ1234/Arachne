package redbacks.arachne.lib.actions;

import redbacks.arachne.lib.checks.ChTrue;
import redbacks.arachne.lib.sensors.NumericSensor;

/**
 * JAVADOC
 * 
 * @author Sean Zammit
 */
public class AcPauseNumSen extends Action
{
	public NumericSensor sensor;
	public boolean pause;
	
	public AcPauseNumSen(NumericSensor sensor, boolean pause) {
		super(new ChTrue());
		this.sensor = sensor;
		this.pause = pause;
	}

	public void onFinish() {
		if(pause) sensor.pause();
		else sensor.unpause();
	}
}