package Day7;

import java.util.*;
import java.util.ArrayList;

public class parallelstream {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        getStudentsList().stream()
                        .forEach(student->System.out.println(student));
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken without parallel stream: " + (endTime - startTime) + " ms");




        System.out.println("************************");




        long startTime1 = System.currentTimeMillis();
        getStudentsList().stream()
                        .parallel()
                        .forEach(student->System.out.println(student));
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken parallel stream: " + (endTime1 - startTime1) + " ms");





    }
    public static List<Student> getStudentsList() {
        ArrayList<Student> studentList = new ArrayList<Student>();

        Student zareen   = new Student(1,  "Zareen K",   23424L,        39);
        Student abhilash = new Student(2,  "Abhilash P", 9876543L,      32);
        Student jatin    = new Student(3,  "Jatin R",    123422L,       22);
        Student rakesh   = new Student(4,  "Rakesh S",   34242111L,     29);
        Student soumik   = new Student(5,  "Soumik R",   98763212L,     27);
        Student priya    = new Student(6,  "Priya K",    234131312L,    31);
        Student lavanya  = new Student(7,  "Lavanya K",  2984242L,      30);
        Student chitra   = new Student(8,  "Chitra M",   242425242L,    19);
        Student kiran    = new Student(9,  "Kiran K",    234132455L,    29);
        Student divya    = new Student(10, "Divya M",    876624242L,    40);
        Student harit    = new Student(11, "Harit B",    132132424L,    25);
        Student bibhu    = new Student(12, "Bibhu M",    234928742L,    28);
        Student vishal   = new Student(13, "Vishal L",   998776654L,    22);
        Student krish    = new Student(14, "Krishna K",  876624242L,    51);

        studentList.add(zareen);
        studentList.add(abhilash);
        studentList.add(jatin);
        studentList.add(rakesh);
        studentList.add(soumik);
        studentList.add(priya);
        studentList.add(lavanya);
        studentList.add(chitra); 
        studentList.add(kiran);
        studentList.add(divya);
        studentList.add(harit);
        studentList.add(bibhu);
        studentList.add(vishal);
        studentList.add(krish);

        // Just to verify data is stored (optional)
        return studentList;
    }
}

class Student {
    int id;
    String studentName;
    long mobileNumber;
    int age;

    public Student(int id, String studentName, long mobileNumber, int age) {
        this.id = id;
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", age=" + age +
                '}';
    }
}
