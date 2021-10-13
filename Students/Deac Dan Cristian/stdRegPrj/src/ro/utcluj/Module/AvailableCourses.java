package ro.utcluj.Module;

public class AvailableCourses {
    public Course[] availableCourses = new Course[100];
    private int iterator = 0;
    public int numberOfAvailableCourses = iterator;
    public AvailableCourses(){

    }
    public void addNewCourse(Course course){
        availableCourses[++iterator] = course;
        numberOfAvailableCourses = iterator;
    }
    public void listAvailableCourses(){
        for(int it = 1; it<=iterator; it++){
            System.out.println(availableCourses[it].name);
        }
    }
}
