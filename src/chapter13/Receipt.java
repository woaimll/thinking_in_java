package chapter13;

import java.util.Formatter;
import java.util.Locale;

public class Receipt {
	/*
	 * private double total = 0; private Formatter f = new Formatter(System.out);
	 * public void printTitle() { f.format("%-15s %5s %10s\n", "Item", "Qty",
	 * "Price"); f.format("%-15s %5s %10s\n", "----", "---", "-----"); } public void
	 * print(String name, int qty, double price) { f.format("%-15.15s %5d %10.2f\n",
	 * name, qty, price); total += price; } public void printTotal() {
	 * f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
	 * f.format("%-15s %5s %10s\n", "", "", "-----"); f.format("%-15s %5s %10.2f\n",
	 * "Total", "", total*1.06); } public static void main(String[] args) { Receipt
	 * receipt = new Receipt(); receipt.printTitle();
	 * receipt.print("Jack's Magic Beans", 4, 4.25); receipt.print("Princess Peas",
	 * 3, 5.1); receipt.print("Three Bears Porridge", 1, 14.29);
	 * receipt.printTotal(); }
	 */
	public static final int ITEM_WIDTH = 15;
	public static final int QTY_WIDTH = 5;
	public static final int PRICE_WIDTH = 10;
	private static final String TITLE_FRMT = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + "s\n";
	private static final String ITEM_FRMT = "%-" + ITEM_WIDTH + "." + ITEM_WIDTH + "s %" + QTY_WIDTH + "d %"
			+ PRICE_WIDTH + ".2f\n";
	private static final String TOTAL_FRMT = "%-" + ITEM_WIDTH + "s %" + QTY_WIDTH + "s %" + PRICE_WIDTH + ".2f\n";
	private double total = 0;
	Formatter f = new Formatter(System.out, Locale.US);

	public void printTitle() {
		f.format(TITLE_FRMT, "Item", "Qty", "Price");
		f.format(TITLE_FRMT, "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format(ITEM_FRMT, name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format(TOTAL_FRMT, "Tax", "", total * 0.06);
		f.format(TITLE_FRMT, "", "", "-----");
		f.format(TOTAL_FRMT, "Total", "", total * 1.06);
	}
}
