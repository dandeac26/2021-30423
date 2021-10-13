package ro.utcluj;

import ro.utcluj.Module.AvailableCourses;
import ro.utcluj.Module.Course;
import ro.utcluj.Module.Student;
import ro.utcluj.Module.StudentRegistry;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentRegistry stReg = new StudentRegistry();
        AvailableCourses avCrs = new AvailableCourses();

        /// Read Students Data
        try{
            File studentsFile = new File("src/ro/utcluj/students.txt");
            Scanner stdReader = new Scanner(studentsFile);

            while(stdReader.hasNextLine()){
                String data = stdReader.nextLine();
                stReg.addStudent(interpretStudentData(data));
            }
            stdReader.close();
        } catch(FileNotFoundException e){
            System.out.println("Error reading from file");
            e.printStackTrace();
        }

        /// Read Courses Data
        try{
            File coursesFile = new File("src/ro/utcluj/courses.txt");
            Scanner crsReader = new Scanner(coursesFile);

            while(crsReader.hasNextLine()){
                String data = crsReader.nextLine();
                avCrs.addNewCourse(interpretCourseData(data));
                //System.out.println(data);
            }
            crsReader.close();
        } catch(FileNotFoundException e){
            System.out.println("Error reading from file");
            e.printStackTrace();
        }

        /// using read data
        System.out.println("///////////Students enrolled: ");
        stReg.printStudentNames();
        System.out.println("\n///////////Available courses for students: ");
        avCrs.listAvailableCourses();

        System.out.println("\nLets print classes that Dan Cristian Deac Attends:");
        for(int i = 1; i <= stReg.numberOfStudents; i++){
            if(stReg.studentList[i].fullName.equals("Dan Cristian Deac"))
                stReg.studentList[i].printAttendingCourses();
        }

        System.out.println("\nTrying name separation function in Student for full name = Thomas Albert James Edison");
        Student newStudent = new Student("Thomas Albert james Edison");
        System.out.println("first name(s): " + newStudent.firstName);
        System.out.println("last name: " + newStudent.lastName);
    }

    public static Student interpretStudentData(String data){
        Student newStd = new Student();
        String[] dataParts = data.split(", ");

        newStd.fullName = dataParts[0];
        newStd.numberOfCredits = Integer.parseInt(dataParts[1]);
        for(int it = 2; it < dataParts.length; it++)
            newStd.addNewAttendingCourse(dataParts[it]);

        return newStd;
    }

    public static Course interpretCourseData(String data){
        Course newCrs = new Course();
        String[] dataParts = data.split(", ");

        newCrs.name = dataParts[0];
        newCrs.creditsNumber = dataParts[1];
        for(int it = 2; it < dataParts.length; it++)
            newCrs.addRoomNumbers(Integer.parseInt((dataParts[it])));

        return newCrs;
    }
}
