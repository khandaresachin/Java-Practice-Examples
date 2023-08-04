package batch2.collectionsframework;

public class Student {

    private String studentId;
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String studentId, String name, int rollNumber, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                '}';
    }
}
