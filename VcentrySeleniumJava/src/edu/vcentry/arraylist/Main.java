package edu.vcentry.arraylist;

public class Main {

	public static void main(String[] args) {
		GroceryList myList = new GroceryList();
		myList.addItem("Cooking oil");
		myList.addItem("Rice");
		myList.addItem("Wheat");
		myList.addItem("Ghee");
		System.out.println("First List gets printed");
		myList.printList();
		decorator();
		System.out.println("Copied List gets printed plus Butter using addAll");
		myList.copyList(myList.getGroceryList());
		decorator();
		System.out.println("Copied List gets printed plus Biscuit using Constructor");
		myList.copyListUsingConstructor(myList.getGroceryList());
		decorator();
		System.out.println("Do my List contains wheat? - Using contains method");
		System.out.println("My List contains " + myList.findItemUsingContains("Wheat"));
		decorator();
		System.out.println("Do my List contains Oats?  - Using indexOf Method retrun the index if present else -1");
		System.out.println("My List contains " + myList.findItemUsingIndexOf("Oats"));
		decorator();
		System.out.println("Replace 3rd element in the list with Oats and checking the same");
		myList.modifyItem(2, "Oats");
		System.out.println("My List contains oats: " + myList.findItemUsingIndexOf("Oats"));
		decorator();
		System.out.println("Print list after adding Oats using for with index");
		myList.printList();
		decorator();
		System.out.println("Print list using for Each");
		myList.printListUsingForEach();
		decorator();
		System.out.println("Removing item by Itemname (Ghee) and Position (Rice in position 1 - 0 based");
		myList.removeItemByItemName("Ghee");
		myList.removeItemByPosition(1);
		myList.printList();
		decorator();
		System.out.println("Replace cooking oil with Rice");
		myList.modifyItem("Cooking oil", "Rice");
		myList.printList();
		decorator();
		System.out.println("Convert Array List to Arrays");
		myList.toArrayFromList();
		decorator();
	}

	public static void decorator() {
		System.out.println("\n**************");
	}
}
