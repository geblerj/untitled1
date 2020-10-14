package com.james;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	ArrayList<Veggie> vegs = new ArrayList<Veggie>();
	vegs.add(new Veggie("Carrot", 2.5, 300, "Orange"));
	vegs.add(new Veggie("Broccoli", 0.9, 39, "Green"));
	vegs.add(new Veggie("Cauliflower", 11.3, 6, "White"));
	vegs.add(new Veggie("Brussel Sprouts", 25, 86, "Green"));
	vegs.add(new Veggie("Green Beans", 6.8, 55, "Green"));
	vegs.add(new Veggie("Beets", 8.5, 100, "Redish"));
	vegs.add(new Veggie("Red Peppers", 2, 20, "Red"));
	vegs.add(new Veggie("Eggplant", 6.9, 111, "Purple"));
	vegs.add(new Veggie("Spinach?", 9.8, 43, "Green"));
	vegs.add(new Veggie("Corn on the Cob", 24, 87, "Yellow"));
	vegs.add(new Veggie("Corn on the Cob", 24, 88, "Blue"));
	System.out.println("Before sorting: " + vegs);
	Collections.sort(vegs, new SortByName());
	System.out.println("After sorting: " + vegs);
	String funk = new Veggie("Tod", 3.2, 98, "Blue").toString();
	System.out.println(funk);
    }
}
