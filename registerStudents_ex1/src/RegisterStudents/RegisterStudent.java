package RegisterStudents;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RegisterStudent {
	private String name;
	private Integer cpf;
	private Date birthDate;
	private String email;

	public RegisterStudent() {
		super();
	}

	public RegisterStudent(String name, Integer cpf, Date birthDate, String email) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer calculateAge() {
		Calendar today = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.setTime(getBirthDate());

		int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

		if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH)) {
			age--;
		} else if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)
				&& today.get(Calendar.DAY_OF_MONTH) < birth.get(Calendar.DAY_OF_MONTH)) {
			age--;
		}

		return age;
	}

	public RegisterStudent getOldestStudent(List<RegisterStudent> students) {
		RegisterStudent oldestStudent = students.get(0);
		for (int i = 1; i < students.size(); i++) {
			if (students.get(i).calculateAge() > oldestStudent.calculateAge()) {
				oldestStudent = students.get(i);
			}
		}
		return oldestStudent;
	}

}
