package com.codehawk.oops;

public abstract class Car implements Vehicle {

	@Override
	public void start() throws Exception {
		System.out.println("Start Car");

	}

	@Override
	public void stop() throws Exception {
		System.out.println("Stop Car");

	}

	@Override
	public void steerLeft() throws Exception {
		System.out.println("Steer Left Car");

	}

	@Override
	public void steerRight() throws Exception {
		System.out.println("Steer Right Car");

	}

	@Override
	public void gearShift() throws Exception {
		System.out.println("Shift Gear in Car");

	}

}
