package com.java.training.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DriverClass {

	public static void main(String[] args) {
		Bus[] b = new Bus[4];
		b[0] = new Bus("Cheran", 101, 12, 200);
		b[1] = new Bus("Cholan", 112, 14, 240);
		b[2] = new Bus("Pandian", 123, 16, 250);
		b[3] = new Bus("MouryaVarma", 106, 10, 0);
	    ArrayList<Bus> bus = new ArrayList<Bus>();
	    for (int i = 0; i < b.length; i++) {
	    	bus.add(b[i]);	
		}
	    System.out.println("Displaying Bus Collection using For Iterator");
	    for (Iterator<Bus> iterator = bus.iterator(); iterator.hasNext();) {
			Bus bus1 = (Bus) iterator.next();
			System.out.println(bus1);
			
		}
	    System.out.println("Removing Bus with 0 available seats using iterator");
	    Bus temp = null;
	    for (Iterator<Bus> iterator = bus.iterator(); iterator.hasNext();) {
			Bus bus1 = (Bus) iterator.next();
			if (bus1.getSeats()==0) 
				temp=bus1;	
		}
		bus.remove(temp);
		System.out.println("Displaying Updated collection bus using lamda expression");
	    Collections.sort(bus, new NComparator());
	    bus.forEach( (n) -> { System.out.println(n); } );
	    System.out.println("Search Result For Cheran using Iterator");
	    for (Iterator<Bus> iterator = bus.iterator(); iterator.hasNext();) {
			Bus bus1 = (Bus) iterator.next();
			if (bus1.getName()=="Cheran") 
				System.out.println(bus1);
		}
	    System.out.println("Displaying Namesorted(Alphabetical) collection bus using lamda expression");
	    Collections.sort(bus, new NComparator());
	    bus.forEach( (n) -> { System.out.println(n); } );
	    System.out.println("Displaying Seatsorted(desc) collection bus using lamda expression");
	    Collections.sort(bus, new SComparator());
	    bus.forEach( (n) -> { System.out.println(n); } );
	    System.out.println("Displaying Durationsorted(shortest frst) collection bus using lamda expression");
	    Collections.sort(bus, new DComparator());
	    bus.forEach( (n) -> { System.out.println(n); } );

	}

}