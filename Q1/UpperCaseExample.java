package guvitask5.Q1;



import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseExample {
    public static void main(String[] args) {

        List<String> names = List.of("aBc", "d", "ef");

        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println(upperCaseNames);;
    }
}