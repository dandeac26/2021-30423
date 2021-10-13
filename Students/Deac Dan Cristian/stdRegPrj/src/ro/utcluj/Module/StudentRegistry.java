package ro.utcluj.Module;

public class StudentRegistry { /// of at least 10 students
    public Student[] studentList = new Student[100];
    public int numberOfStudents = 0;
    private int iterator = 0;

    public StudentRegistry(){
    }

    public void addStudent(Student std){
        studentList[++iterator] = std;
        numberOfStudents = iterator;
    }
    public void printStudentNames(){
        for(int it = 1; it<=numberOfStudents; it++)
            System.out.println(studentList[it].fullName);
    }
}
