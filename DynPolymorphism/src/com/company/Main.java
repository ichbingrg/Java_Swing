package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Animal animal;

        System.out.println("What Animal do you want ? ");
        System.out.print("1=dog, 2=cat :");
        int choice = in.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal = new Cat();
            animal.speak();
        }else{
            animal= new Animal();
            System.out.println("Invalid Choice");
            animal.speak();
        }

    }
}
