package task1;
public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer thinkPad = new Computer();
		thinkPad.freeMemory = 200;
		thinkPad.hardDiskMemory = 512;
		thinkPad.isNoteBook = true;
		thinkPad.operationSystem = "Windows 7 Pro";
		thinkPad.price = 9000;
		thinkPad.year = 2015;

		Computer proDesk = new Computer(2014, 800, 500, 200);

		System.out.println("Result of comparing the price of thinkPad with the price of proDesk: "
				+ thinkPad.comparePrice(proDesk));
		System.out.println("Result of comparing the price of proDesk with the price of thinkPad: "
				+ proDesk.comparePrice(thinkPad));
	}

}