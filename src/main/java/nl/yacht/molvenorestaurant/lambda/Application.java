package nl.yacht.molvenorestaurant.lambda;

import java.util.Arrays;
import java.util.List;

public class Application {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);

        numbers.stream().filter(n -> n % 2 == 0).forEach(element -> {
            System.out.println(element);
        });


        System.out.println("That was part I");

        numbers.stream().filter(n -> n % 2 != 0).map(n -> n * n).forEach(element -> {
            System.out.println(element);
        });

        System.out.println("That was part II");


        numbers.stream().filter(n -> n > 5).filter(n -> n % 2 != 0).map(n -> n * n).forEach(element -> {
            System.out.println(element);
        });







    }
}
