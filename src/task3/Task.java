package task3;

class Task {

	// Класът Task представя някакво количество работа(задача) което
	// трябва да бъде свършено.

	// Класът да има следните полета:
	// име
	// workingHours – числов тип, който показва колко часа остават на
	// задачата за да бъде изпълнена
	private String name;
	private double workingHours;

	// Класът да има конструктор които задава валидни стойности на 2-те
	// полета.
	Task(String name, double workingHours) {
		if (name.trim().length() != 0 && workingHours > 0) {
			this.name = name;
			this.workingHours = workingHours;
		} else {
			System.out.println("\nUnvalid setting of task.");
		}
	}

	// Да се направят подходящи методи за достъпване на полетата (setters
	// and getters).
	String getName() {
		return this.name;
	}

	void setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}

	double getWorkingHours() {
		return this.workingHours;
	}

	boolean checkTaskValidity() {
		if (this.name != null) {
			return true;
		} else {
			return false;
		}
	}

}
