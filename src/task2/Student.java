package task2;

public class Student {

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (!this.isDegree) {
			++this.yearInCollege;
		} else {
			System.out.println("The year in school can not be increased.");
			System.out.println(this.name + " already has a degree.");
		}

		if (this.yearInCollege == 4) {
			this.isDegree = true;
		}
	}

	double receiveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			money += amount;
		}
		return money;
	}
}
