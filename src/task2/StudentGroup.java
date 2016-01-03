package task2;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class StudentGroup {

	String groupSubject;
	Student[] students;
	int freePlaces;

	StudentGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student s) {
		if (this.freePlaces > 0 && s.subject.equals(this.groupSubject)) {
			this.students[this.students.length - this.freePlaces] = s;
			--this.freePlaces;
		} else if (!s.subject.equals(this.groupSubject)) {
			System.out.println(
					"\nThe subject of this student is not equal to the subject of group " + this.groupSubject + ". ");
		} else if (this.freePlaces == 0) {
			System.out.println("\nThere are no free places in this group.");
		}
	}

	void emptyGroup() {
		students = new Student[5];
		freePlaces = 5;
	}

	String theBestStudent() {
		String problem;
		if (this.students.length == this.freePlaces) {
			problem = "There are no students in this group.";
			return problem;
		} else {
			int theIndexOfBestStudent = 0;
			int counter = 1;
			for (int i = 1; i < this.students.length - this.freePlaces; i++) {
				if (this.students[i].grade > this.students[theIndexOfBestStudent].grade) {
					theIndexOfBestStudent = i;
					counter = 1;
				} else if (this.students[i].grade == this.students[theIndexOfBestStudent].grade) {
					++counter;
				}
			}
			if (counter > 1) {
				problem = "The are more than one students with grades equal to the best grade.";
				return problem;
			} else
				return this.students[theIndexOfBestStudent].name;
		}
	}

	void printStudentsInGroup() {
		if (this.students.length == this.freePlaces) {
			System.out.println("\nThere are no students in group " + this.groupSubject + ". ");
		} else {
			System.out.println("\nStudents in this group:");
			for (int i = 0; i < this.students.length - this.freePlaces; i++) {
				System.out.println("name: " + this.students[i].name);
				System.out.println("subject: " + this.students[i].subject);
				System.out.println("grade: " + this.students[i].grade);
				System.out.println("year in college: " + this.students[i].yearInCollege);
				System.out.println("age: " + this.students[i].age);
				System.out.println("degree: " + (this.students[i].isDegree ? "yes" : "no"));
				System.out.println("money: " + this.students[i].money + " $");
				System.out.println();
			}
		}
	}
}
