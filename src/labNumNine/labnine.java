package labNumNine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class labnine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> customersList = itemsList();
		ArrayList<Double> customersPrice = itemsPrice();

		ArrayList<String> userOrder = new ArrayList<>();
		ArrayList<Double> userPrices = new ArrayList<>();

		String addMore = "yes";
		do {
			printMenu(customersList, customersPrice);
			System.out.println("Please place your order from this on the list");
			String userInput = scan.next();

			if (userInput.equalsIgnoreCase("banana")) {
				userOrder.add("banana");
				userPrices.add(1.99);
				System.out.println("banana has been added to your order");
			} else if (userInput.equalsIgnoreCase("Mango")) {
				userOrder.add("Mango");
				userPrices.add(5.00);
				System.out.println("Mango has been added to your order");
			} else if (userInput.equalsIgnoreCase("Apple")) {
				userOrder.add("Apple");
				userPrices.add(6.35);
				System.out.println("Apple has been added to your order");
			} else if (userInput.equalsIgnoreCase("Cookies")) {
				userOrder.add("Cookies");
				userPrices.add(4.90);
				System.out.println("Apple has been added to your order");
			} else if (userInput.equalsIgnoreCase("kiwi")) {
				userOrder.add("kiwi");
				userPrices.add(2.00);
				System.out.println("kiwi has been added to your order");
			} else if (userInput.equalsIgnoreCase("Figs")) {
				userOrder.add("Figs");
				userPrices.add(1.99);
				System.out.println("Figs has been added to your order");
			} else if (userInput.equalsIgnoreCase("Honeydew")) {
				userOrder.add("Honeydew");
				userPrices.add(2.35);
				System.out.println("Honeydew has been added to your order");
			} else if (userInput.equalsIgnoreCase("Dragonfruit")) {
				userOrder.add("Dragonfruit");
				userPrices.add(4.65);
				System.out.println("Dragonfruit has been added to your order");
			} else {
				System.out.println("User input not found please try again");
				continue;
			}
			try {
				System.out.println("Would you like to add more to your order? yes/no");
				addMore = scan.next();
			} catch (InputMismatchException e) {
				System.out.println("Input not recognized please enter yes/no");
				scan.nextLine();
				continue;
			}

		} while (addMore.equalsIgnoreCase("yes"));
		for (int i = 0; i < userOrder.size(); i++) {
			System.out.println(userOrder.get(i) + " " + userPrices.get(i));
		}
		double userOrderSum = 0;
		for (int x = 0; x < userOrder.size(); x++) {
			userOrderSum = userOrderSum + userPrices.get(x);
		}
		System.out.println("Average price of this grocery list was " + (userOrderSum / userOrder.size()));
		System.out.println("The highest priced item on your list was " + highestValue(userPrices));
		System.out.println("the lowest price on your list was " + lowestValue(userPrices));
	}

	public static ArrayList<String> itemsList() {
		ArrayList<String> itemsList = new ArrayList<>();
		// list of things on the menu
		itemsList.add("banana");
		itemsList.add("Mango");
		itemsList.add("Apple");
		itemsList.add("Cookies");
		itemsList.add("kiwi");
		itemsList.add("Figs");
		itemsList.add("Honeydew");
		itemsList.add("Dragonfruit");

		return itemsList;
	}

	public static ArrayList<Double> itemsPrice() {
		ArrayList<Double> itemPrice = new ArrayList<>();
		// list of prices of things on the menu
		itemPrice.add(1.99);
		itemPrice.add(5.00);
		itemPrice.add(6.35);
		itemPrice.add(4.90);
		itemPrice.add(2.00);
		itemPrice.add(1.99);
		itemPrice.add(2.35);
		itemPrice.add(4.65);

		return itemPrice;
	}

	public static void printMenu(ArrayList<String> list, ArrayList<Double> price) {
		for (int i = 0; i < itemsList().size(); i++) {
			System.out.println(itemsList().get(i) + " " + itemsPrice().get(i));
		}
	}

	public static double highestValue(ArrayList<Double> values) {
		Double i = Collections.max(values);
		return i;

	}

	public static double lowestValue(ArrayList<Double> values) {
		Double i = Collections.min(values);
		return i;
	}

}