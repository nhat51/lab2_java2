package HomeWork.Lab2;

import java.util.Scanner;

public class Calculator_main {
    private int size;
    private int sum;


    public Calculator_main() {
        this.sum = 0;
    }

    public int getSize() {
        return size;
    }

    public void setN(int size) {
        this.size = size;
    }

    public int[] intArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {

            System.out.println("Element " + i + ", typed value was " + intArray[i]);
        }
        return intArray;
    }

    public int getSum(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            this.sum += intArray[i];
        }
        return this.sum;
    }

    public double getAverage(int sum, int size) {
        return (double) sum / size;
    }

    public static void main(String[] args) {
        Calculator_main cal = new Calculator_main();
        int size;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

        System.out.println("Enter " + size + " integer values");

        int[] ar = cal.intArray(size);

        int inSum = cal.getSum(ar);


        System.out.println("Average is " + cal.getAverage(inSum, size));
    }
}
