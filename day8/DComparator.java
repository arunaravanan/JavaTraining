package com.java.training.day8;

import java.util.Comparator;

public class DComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus a, Bus b) {
		// TODO Auto-generated method stub
		return a.getDuration() - b.getDuration();
	}
}
