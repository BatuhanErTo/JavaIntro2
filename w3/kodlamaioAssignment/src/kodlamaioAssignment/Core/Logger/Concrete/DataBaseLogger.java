package kodlamaioAssignment.Core.Logger.Concrete;

import kodlamaioAssignment.Core.Logger.Abstract.Logger;

public class DataBaseLogger implements Logger{

	@Override
	public void log() {
		System.out.println("Logged to Database");
	}

}
