/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

import java.util.Scanner;

/**
 *
 * @author bosslady
 */
public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course ID:");
        int courseId = scanner.nextInt();

        // Validate CourseID
        switch (courseId) {
            case 1 -> {
                System.out.println("Course ID: 1");
                System.out.println("Course Name: Software Engineering");
                System.out.println("Course Fee: 900,000");
            }
            case 2 -> {
                System.out.println("Course ID: 2");
                System.out.println("Course Name: Information Technology");
                System.out.println("Course Fee: 750,000");
            }
            case 3 -> {
                System.out.println("Course ID: 3");
                System.out.println("Course Name: Computer Science");
                System.out.println("Course Fee: 800,000");
            }
            case 4 -> {
                System.out.println("Course ID: 4");
                System.out.println("Course Name: Computer Engineering");
                System.out.println("Course Fee: 950,000");
            }
            default -> System.out.println("Wrong CourseID details");
        }
    }
}
