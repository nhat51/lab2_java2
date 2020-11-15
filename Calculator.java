package HomeWork.Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of number:");
        n = input.nextInt();
        System.out.println("Enter "+ n + " integer values");
        int[] Array = new int[n];
        for (int i =0;i<n;i++){
            System.out.printf("Value %d: ",i);
            Array[i] = input.nextInt();
            sum += Array[i];
        }
        for (int i = 0;i < n;i++){
            System.out.println("Element"+ i + ",typed value was" + Array[i]);
        }
        double avg = sum/n;
        System.out.println("Average is " + avg);
    }


}
