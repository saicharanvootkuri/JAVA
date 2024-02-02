class Student {

	private String studentName;
	private int studentRoll;
	private int studentAge;


	public int getAge() { return studentAge; }

	public String getName() { return studentName; }

	public int getRoll() { return studentRoll; }

	public void setAge(int newAge) { studentAge = newAge; }

	public void setName(String newName) {
		studentName = newName;
	}

	public void setRoll(int newRoll) { studentRoll = newRoll; }
}

class TestEncapsulation {
	public static void main(String[] args) {
		Student studentObj = new Student();

		studentObj.setName("John");
		studentObj.setAge(20);
		studentObj.setRoll(101);

		System.out.println("Student's name: " + studentObj.getName());
		System.out.println("Student's age: " + studentObj.getAge());
		System.out.println("Student's roll: " + studentObj.getRoll());
	}
}
