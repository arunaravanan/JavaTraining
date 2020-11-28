package com.java.training.day8;

public class Bus {
	private String name;
	private int id;
	private int duration;
	private int seats;

	public Bus(String name, int id, int duration, int seats) {
		super();
		this.name = name;
		this.id = id;
		this.duration = duration;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + ", id=" + id + ", duration=" + duration + ", seats=" + seats + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	

	

	
}
