package com.stackroute.practice5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {

    @Test
    public void implementStudents() {
        Student S1 = new Student(); S1.setAge(23);S1.setId(1);S1.setStudentName("Gopal");
        Student S2 = new Student(); S2.setAge(22);S2.setId(2);S2.setStudentName("Upasana");
        Student S3 = new Student(); S3.setAge(23);S3.setId(3);S3.setStudentName("Aman");
        Student S4 = new Student(); S4.setAge(22);S4.setId(4);S4.setStudentName("Upasana");
        Student S5 = new Student(); S5.setAge(26);S5.setId(5);S5.setStudentName("Sounak");

        ArrayList<Student> actualList = new ArrayList<>();
        actualList.add(S1);actualList.add(S2);
        actualList.add(S3);actualList.add(S4);
        actualList.add(S5);

        ArrayList<Student> expectedList = new ArrayList<>();
        expectedList.add(S5);expectedList.add(S1);
        expectedList.add(S3);expectedList.add(S4);
        expectedList.add(S2);

        assertEquals(expectedList,MainTest.implementStudents(actualList));
    }
}