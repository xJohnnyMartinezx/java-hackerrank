package hacker_rank_practice.data;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaNumberFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

//        **** HAVE TO USE NUMBERFORMAT AND GET CURRENCY INSTANCE METHODS **** LOCALE.US(COUNTRY) FOR GEOGRAPHICAL/POLITICAL AND IN THIS CASE CURRENCY PROPERTIES. *****

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
