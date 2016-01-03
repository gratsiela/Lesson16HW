package task2;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student john = new Student();
		john.name = "John John";
		john.subject = "IT";
		john.age = 19;

		Student georg = new Student("Georg Georg", "IT", 19);

		john.upYear();
		john.upYear();
		john.upYear();
		john.upYear();

		georg.upYear();
		georg.grade = 5.50;

		StudentGroup it = new StudentGroup();
		it.groupSubject = "IT";
		it.students = new Student[2];
		it.freePlaces = 2;
		it.addStudent(georg);

		Student steve = new Student("Steve Steve", "IT", 20);
		georg.grade = 6;
		steve.grade = 6;
		it.addStudent(steve);

		System.out.println("\nFree places in group " + it.groupSubject + ": " + it.freePlaces);
		System.out.println("\nThe best student in group " + it.groupSubject + ": " + it.theBestStudent());
		it.printStudentsInGroup();
		it.emptyGroup();
		it.printStudentsInGroup();
		System.out.println("\nThe best student in group " + it.groupSubject + ": " + it.theBestStudent());
	}

}
