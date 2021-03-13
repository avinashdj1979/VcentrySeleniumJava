package com.vcentry.arraylist;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> myGroceryList = new ArrayList<String>();

	public ArrayList<String> getMyGroceryList() {
		return myGroceryList;
	}
	
	public void addItemsToList() {
		myGroceryList.add("Rice");
		myGroceryList.add("Wheat");
		myGroceryList.add("Milk");
	}
	
	public void printGroceryList() {
		for(String item : myGroceryList) {
			System.out.println(item);
		}
	}

}
