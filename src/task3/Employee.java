package task3;

class Employee {

	// Да се създаде клас Employee репрезентиращ работник.

	// Класът да има следните полета:
	// name – име на работника
	// currentTask – обект от тип Task, който показва текущата задача в/у
	// която работи работника
	// hoursLeft – числова стойност, която показва колко работни часа
	// остават на работника (за днес)
	private String name;
	private Task currentTask;
	private double hoursLeft;

	// Класът да има конструктор с 1 параметър, който инициализира полето
	// name.
	Employee(String name) {
		if (name.trim().length() == 0) {
			System.out.println("\nInvalid set of name of employee.");
		} else {
			this.name = name;
		}
	}

	// Да се направят подходящи getter-и и setter-и за полетата на класа
	// (setter-ите да проверяват дали данните са валидни - името да не
	// празно, часовете да са положително число...).
	void setHoursLeft(double hoursLeft) {
		if (hoursLeft < 0) {
			System.out.println("\nInvalid set of working hours.");
		} else {
			this.hoursLeft = hoursLeft;
		}
	}

	void setTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	String getName() {
		return this.name;
	}

	double getHoursLeft() {
		return this.hoursLeft;
	}

	Task getTask() {
		return this.currentTask;
	}

	// Да се направи метод без параметри work() на класа Employee. С
	// извикването на този метод, работника за който е извикан метода
	// работи по текущата си задача (ако има такава). Например ако
	// работника има останали 4 часа за работа, а по задачата има останали
	// 7 часа работа, след изпълнението на метода работника ще е останал с
	// 0 часа работа за деня, а по задачата ще е останало 3 часа работа. Ако
	// работника има 8 часа, след изпълнението на метода work() работника
	// ще е останал с 1 час работа за деня, а времето което остава на
	// задачата да бъде свършена ще е 0.
	void work() {
		if (this.name == null) {
			System.out.println("\nInvalid name of employee.");
		} else if (this.hoursLeft == 0) {
			System.out.println("\nThe workday of this employee is finished.");
		} else if (!this.currentTask.checkTaskValidity()) {
			System.out.println("\nInvalid task.");
		} else if (this.currentTask.getWorkingHours() == 0) {
			System.out.println("\nThis task is already done.");
		} else {
			if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
			} else {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
			}
			showReport();
		}
	}

	// Да се направи и метод showReport, който се извиква след като
	// работника поработи в/у текущата си задача (извикване на work) и
	// показва информация (принтирайки на конзолата) за:
	// името на работника
	// името на задачата
	// работните часовете които остават на работника
	// часовете които остават на текущата задача на работника за да бъде
	// изпълнена
	private void showReport() {
		System.out.println("\nReport: ");
		System.out.println("name: " + this.name);
		System.out.println("task: " + this.currentTask.getName());
		System.out.println(this.hoursLeft + " working hours left");
		System.out.println(this.currentTask.getWorkingHours() + " task working hours left");
	}

}
