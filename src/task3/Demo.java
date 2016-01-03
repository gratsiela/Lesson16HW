package task3;

class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task task1 = new Task(null, 1);
		Task task2 = new Task("washing dishes", 0.5);
		Task task3 = new Task("ironing", 1);
		Task task4 = new Task("cleaning", 2);
		Task task5 = new Task("cooking", 2);

		Employee employee1 = new Employee("Mimi");
		employee1.setHoursLeft(5.5);
		employee1.setTask(task5);
		employee1.work();
		employee1.setTask(task1);
		employee1.work();
		employee1.setTask(task4);
		employee1.work();
		employee1.setTask(task4);
		employee1.work();
		employee1.setTask(task2);
		employee1.work();
		employee1.setTask(task3);
		employee1.work();

		task5 = new Task("   ", 6);
		employee1.setTask(task5);
		task5 = new Task("sleeping", -1);
		employee1.setTask(task5);
	}

}
