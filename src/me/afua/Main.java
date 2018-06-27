package me.afua;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student aStudent = new Student();
        aStudent.setFirstName("Chidimma");
        aStudent.setLastName("Uba");
        aStudent.setAge(89);

        Student anotherStudent = new Student();
        anotherStudent.setFirstName("Papa Kweku");
        anotherStudent.setLastName("Habib");
        anotherStudent.setAge(22);

//        System.out.println("The student's first name is:"+aStudent.getFirstName());
//        System.out.println("The other student's first name is:"+anotherStudent.getFirstName());

        ArrayList <Student> studentList = new ArrayList<>();
        System.out.println("This arraylist is empty because it has "+studentList.size()+" elements");
        studentList.add(aStudent);
        studentList.add(anotherStudent);
        System.out.println("This is the size of the arraylist:"+studentList.size());

        for (Student eachStduent:studentList) {
            System.out.println("The student's first name is:"+eachStduent.getFirstName()+" and his/her age is:"+eachStduent.getAge());
        }




    }

}
