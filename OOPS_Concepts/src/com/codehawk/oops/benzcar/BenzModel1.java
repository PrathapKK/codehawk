package com.codehawk.oops.benzcar;

import com.codehawk.oops.Car;

public class BenzModel1 extends Car {

	
	public BenzModel1() {
		System.out.println("BenzModel 1 Constructor");
	}
	
	@Override
	public void start() throws Exception {
		System.out.println("BenzModel Start");
		super.start();
	}

	@Override
	public void stop() throws Exception {
		System.out.println("BenzModel Stop");
		super.stop();
	}

	@Override
	public void steerLeft() throws Exception {
		System.out.println("BenzModel SteerLeft");
		super.steerLeft();
	}

	@Override
	public void steerRight() throws Exception {
		System.out.println("BenzModel SteerRight");
		super.steerRight();
	}

	@Override
	public void gearShift() throws Exception {
		System.out.println("BenzModel ShiftGear");
		super.gearShift();
	}
	
	

}
