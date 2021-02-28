package edu.vcentry.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class GroceryList {
	
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public ArrayList<String> getGroceryList() {
		return groceryList;
	}
	
	public void addItem(String itemName) {
		groceryList.add(itemName);
	}
	
	public void removeItemByPosition(int position) {
		groceryList.remove(position);
	}
	
	public void removeItemByItemName(String itemName) {
		groceryList.remove(itemName);
	}
	
	public void modifyItem(String oldItem, String newItem) {
		int position = groceryList.indexOf(oldItem);
		if( position >= 0) {
			modifyItem(position, newItem);
		}
	}
	
	public void modifyItem(int position, String newItem) {
		groceryList.set(position, newItem);
	}
	
	public String findItemUsingContains(String newItem) {
		if(groceryList.contains(newItem)){
			return newItem;
		} 
		return null;
	}
	
	public String findItemUsingIndexOf(String newItem) {
		if(groceryList.indexOf(newItem) >= 0) {
			return newItem;
		}
		return null;
	}
	
	public void printList() {
		for (int i = 0; i < (groceryList.size()); i++) {
			System.out.printf("%d. %s \n", (i+1), groceryList.get(i));
		}
	}
	
	public void printListUsingForEach() {
		int i = 1;
		for(String item : groceryList) {
			System.out.printf("%d. %s \n", i, item);
			i++;
		}
	}
	
	public void printUsingIterator() {
		Iterator<String> iter = groceryList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public void toArrayFromList() {
		String myArray[] = new String[groceryList.size()];
		myArray = groceryList.toArray(myArray);
		
		for(String item : myArray) {
			System.out.println(item);
		}
	}
	
	public void copyList(ArrayList<String> arrayList) {
		ArrayList<String> newList = new ArrayList<String>();
		newList.addAll(arrayList);
		newList.add("Butter added along with the old list");
		for (int i = 0; i < (newList.size()); i++) {
			System.out.printf("%d. %s \n", (i+1), newList.get(i));
		}
	}

	public void copyListUsingConstructor(ArrayList<String> arrayList) {
		ArrayList<String> newList = new ArrayList<String>(arrayList);
		newList.add("Biscuits");
		for (int i = 0; i < (newList.size()); i++) {
			System.out.printf("%d. %s \n", (i+1), newList.get(i));
		}
	}
}
