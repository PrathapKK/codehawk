package com.codehawk.oops.benzcar;

import com.codehawk.oops.Car;
import com.codehawk.oops.Vehicle;

public class OopsTest {
	
	  static  public void main(String args[]) throws Exception {
		  
		 Vehicle benzModel1 = new BenzModel1();
		
		 benzModel1.start();
		 benzModel1.gearShift();
		 benzModel1.gearShift();
		 benzModel1.steerLeft();
		 benzModel1.steerRight();
		 benzModel1.gearShift();
		 benzModel1.stop();
		 
		 Car bezcar = (Car) benzModel1;
		 bezcar.start();
		 bezcar.gearShift();
		 bezcar.gearShift();
		 bezcar.steerLeft();
		 bezcar.steerRight();
		 bezcar.gearShift();
		 bezcar.stop();
		
	}

}
