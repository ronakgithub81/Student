/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Ronak
 */
public class StudentList {
    public static void main(String[] args)
    {
        Student [] studentList =new Student[2];
        
        Student s1 = new Student();
        s1.setName("Ronak");
        
        Student s2 = new Student();
        s2.setName("Sheth");
        
        studentList[0] =s1;
        studentList[1] =s2;
        
        for (Student s : studentList){
            System.out.println(s.getName());
        }
        
        
    }
    
}
