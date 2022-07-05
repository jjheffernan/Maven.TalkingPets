package io.zipcoder.polymorphism;
import java.util.Scanner;
import java.util.ArrayList;
public class MainApplication {

    Scanner scan = new Scanner(System.in);

    // System.out.println("How many pets do you have?"); //println is being unorthodox
    int petCount = scan.nextInt();
    ArrayList<String> pets = new ArrayList<String>(petCount);
    // test comment. for loop acting incorrectly
    for(int i = 0; i < petCount; i++) {
        Pet.setName("What is your pets name? \n");
        Pet.getType("What type of pet is that? \n");
    }
    // String nameIn = scan.nextLine();
}
