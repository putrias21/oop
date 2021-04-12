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
public class TestCourse {
    public static void printstudent(int n, Course course){
        ArrayList<String> nama_student = course.getStudents();
        int numberOfStudents = course.getNumberOfStudents();
        
        System.out.println("Number of students in course " + n + " : " + numberOfStudents);
        for(int i = 0; i < numberOfStudents; i++){
            System.out.print(nama_student.get(i) + ", ");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Course course1 = new Course("course1");
        Course course2 = new Course("course2");
        
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        
        printstudent(1, course1);
        
        System.out.print("\n\n");
        printstudent(2, course2);
        
        System.out.println("\n\nDrop students : Peter Jones from course1");
        course1.dropStudent("Peter Jones");  
        printstudent(1, course1);
        // TODO code application logic here
    }
    
}
