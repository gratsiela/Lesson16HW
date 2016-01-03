package task1;
public class Computer {

	int year;
	double price;
	boolean isNoteBook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		this.isNoteBook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price < c.price) {
			return 1;
		} else {
			return 0;
		}
	}

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(double memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= memory;
		}
	}

	static int n = 1;

	void printInfo() {
		System.out.println("\nInformation for computer " + (n++) + ": ");
		System.out.println("year: " + year);
		System.out.println("price: " + price);
		System.out.println(isNoteBook ? "NOTEBOOK" : "DESKTOP COMPUTER");
		System.out.println("hard disk memory: " + hardDiskMemory);
		System.out.println("free memory: " + freeMemory);
		System.out.println("operating system: " + operationSystem);
	}

}
