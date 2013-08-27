package com.codehawk.oops;

public abstract class Truck implements Vehicle {

	@Override
	public void start() throws Exception {
		System.out.println("Start Truck");

	}

	@Override
	public void stop() throws Exception {
		System.out.println("Stop Truck");

	}

	@Override
	public void steerLeft() throws Exception {
		System.out.println("Steer Left Truck");

	}

	@Override
	public void steerRight() throws Exception {
		System.out.println("Steer Right Truck");

	}

	@Override
	public void gearShift() throws Exception {
		System.out.println("Shift Gear in Truck");

	}

}
