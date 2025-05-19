public class StudentDatabase {
    private Student[] students = new Student[100];

    public StudentDatabase() {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("", "", 0, "", 0);
        }
    }

    public void dodajStudenta(int index, Student student) {
        if (index >= 0 && index < students.length) {
            students[index] = student;
        } else {
            System.out.println("Niepoprawny indeks.");
        }
    }

    public void edytujStudenta(int index, Student student) {
        dodajStudenta(index, student);
    }

    public void usunStudenta(int index) {
        if (index >= 0 && index < students.length) {
            students[index] = new Student("", "", 0, "", 0);
        } else {
            System.out.println("Niepoprawny indeks.");
        }
    }

    public void pokazStudenta(int index) {
        if (index >= 0 && index < students.length) {
            students[index].pokazDane();
        } else {
            System.out.println("Niepoprawny indeks.");
        }
    }

    public void pokazWszystkich() {
        for (Student student : students) {
            student.pokazDane();
        }
    }
}