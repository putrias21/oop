/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;
    import java.util.ArrayList;
/**
 *
 * @author putri aurelia
 */
public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;
    
    Course(String courseName){
        this.courseName = courseName;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }
    
    public void dropStudent(String student){
        for(int i = 0; i < numberOfStudents; i++){
            if(students.get(i).equals(student)){
                students.remove(i);
                numberOfStudents--;
                break;
            }
        }
    }
    
    public ArrayList<String> getStudents(){
        return students;
    }
    
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}
