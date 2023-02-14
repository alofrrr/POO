package RegisterStudents;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		RegisterStudent student1 = new RegisterStudent("Josenildo", 1012023000, dateFormat.parse("16/05/1995"),
				"josenildo@gmail.com");
		RegisterStudent student2 = new RegisterStudent("Excalibur", 1012022500, dateFormat.parse("23/11/1986"),
				"excalibur@gmail.com");
		RegisterStudent student3 = new RegisterStudent("Nalau", 1012022500, dateFormat.parse("30/12/2001"),
				"nalau@gmail.com");
		RegisterStudent student4 = new RegisterStudent("Grissi", 1235886821, dateFormat.parse("18/05/1975"),
				"grissi@gmail.com");

		List<RegisterStudent> students = new ArrayList<RegisterStudent>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

		System.out.println("Lista de Alunos: \n");

		for (RegisterStudent student : students) {
			System.out.println("Nome: " + student.getName());
			System.out.println("CPF: " + student.getCpf());
			System.out.println("Idade: " + student.calculateAge());
			System.out.println("Data de Nascimento: " + student.getBirthDate());
			System.out.println("E-mail: " + student.getEmail());
			System.out.println("\n");
		}

		RegisterStudent oldestStudent = new RegisterStudent();
		oldestStudent = oldestStudent.getOldestStudent(students);
		System.out.println("O aluno mais velho é " + oldestStudent.getName());

	}

}
