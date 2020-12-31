package programming;

import java.util.List;

public class FP01Excercises {

    public static void main(String[] args){

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure",
                "Docker","Kubernetes");

        //printOddNumbersInListFunctional(numbers);
        //printAllCoursesInListFunctional(courses);
        //printAllCoursesSpringInListFunctional(courses);
        printAllCoursesFourLettersInListFunctional(courses);
    }

    //Excercise 1
    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        System.out.println("Print Only Odd Numbers from the List ");

        numbers.stream()
                //Filter - Only Allow Even Numbers
                //.filter(FP01::isEven)
                .filter(number -> number%2 == 1) //Lambda expression
                .forEach(System.out::println);//Method reference

    }

    //Excercise 2
    private static void printAllCoursesInListFunctional(List<String> courses) {
        //What to do?
        System.out.println("Print All Courses Individually");
        courses.stream()
                .forEach(System.out::println);//Method reference

    }

    //Excercise 3
    private static void printAllCoursesSpringInListFunctional(List<String> courses) {
        //What to do?
        System.out.println("Print All Courses Containing the word Spring");
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);//Method reference

    }

    //Excercise 4
    private static void printAllCoursesFourLettersInListFunctional(List<String> courses) {
        //What to do?
        System.out.println("Print All Courses Whose Name has at least 4 letters");
        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);//Method reference

    }
}
