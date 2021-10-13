package ro.utcluj.Module;
@SuppressWarnings("StringConcatenationInLoop")
public class Student {
    public String firstName = "";
    public String lastName = "";
    public String fullName = "";
    public String[] attendingCourses = new String[100];
    public int numberOfCoursesAttended = 0;
    private int iterator = 0;
    public int numberOfCredits = 0;

    public Student(){
    }

    public Student(String fullName){
        this.fullName = fullName;
        String[] splitPart = fullName.split(" ");
        for(int i = 0; i<splitPart.length-1; i++) {
            this.firstName += splitPart[i];
            if(i<splitPart.length-2)
                this.firstName += ' ';
        }
        this.lastName = splitPart[splitPart.length-1];
    }

    public void printAttendingCourses(){
        System.out.print(this.fullName + " attends: ");
        for(int i = 1; i<=numberOfCoursesAttended; i++){
            if(i > 1 && i < numberOfCoursesAttended)
                System.out.print(", ");
            else if (i == numberOfCoursesAttended)
                System.out.print(" and ");
            System.out.print(attendingCourses[i]);
        }
        System.out.println();

    }
    public void addNewAttendingCourse(String course){
        attendingCourses[++iterator] = course;
        numberOfCoursesAttended = iterator;
    }
}
