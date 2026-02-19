package guvitask5.Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGifts{
    public static void main(String[] args) {

        List<String> students = Arrays.asList(
                "Amit", "Ravi", "Anita", "Suresh", "Arjun",
                "Neha", "Aakash", "Priya", "Rahul", "Anjali"
        );

        List<String> specialGiftStudents = students.stream()
                                                    .filter(name -> name.startsWith("A"))
                                                    .collect(Collectors.toList());

        System.out.println("Students eligible for special gifts:");
        System.out.println(specialGiftStudents);
    }
}


    

