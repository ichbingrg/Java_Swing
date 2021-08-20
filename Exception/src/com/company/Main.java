package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a Whole number to divide : ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by : ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result: " + z);
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by 0!!");
        } catch(InputMismatchException e){
            System.out.println("Enter a whole number man!!!");
        }catch (Exception e){
            System.out.print("ErrorErrorError");
        }finally{
            System.out.println("This will always happen");
            scanner.close();
        }

    }
}
