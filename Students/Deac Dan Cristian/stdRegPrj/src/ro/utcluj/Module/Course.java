package ro.utcluj.Module;

public class Course {
    public String name = "";
    public String creditsNumber = "";
    public int[] roomNumbers = new int[10000];
    public int numberOfRooms = 0;
    private int iterator = 0;

    public Course(){

    }
    public void addRoomNumbers(int number){
        roomNumbers[++iterator] = number;
        numberOfRooms = iterator;
    }

}
