package programming;

import java.util.List;

public class FP01 {

    public static void main(String[] args){

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        //printEvenNumbersInListFunctional(numbers);
        printSquaresOfEvenNumbersInListFunctional(numbers);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for (int number: numbers) {
            System.out.println(number);
        }

    }
    /*
    private static void print(int number){
        System.out.println(number);
    }

     */

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream()
                .forEach(System.out::println);//Method reference

    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for (int number: numbers) {
            if(number%2==0) {
                System.out.println(number);
            }
        }

    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream()
                //Filter - Only Allow Even Numbers
                //.filter(FP01::isEven)
                .filter(number -> number%2 == 0) //Lambda expression
                .forEach(System.out::println);//Method reference

    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream()
                //Filter - Only Allow Even Numbers
                //.filter(FP01::isEven)
                .filter(number -> number%2 == 0) //Lambda expression
                //mapping x -> x2
                .map(number -> number*number)
                .forEach(System.out::println);//Method reference

    }

    private static boolean isEven(int number){
        return number%2 == 0;
    }
}
