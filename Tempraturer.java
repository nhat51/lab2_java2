package HomeWork.Lab2;

import java.util.Scanner;
public class Tempraturer {
    public static void main(String[] args) {
        int n;
        double sum = 0;
        double count = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("How many day's temperature?");
        n = in.nextInt();
        int[] temp = new int[n];
        for (int i =1;i<n;i++){
            System.out.printf("Day %d's temperature: ",i);
            temp[i] = in.nextInt();
            sum += temp[i];
        }
        double avg = sum/n;
        System.out.println("Average = " + avg);
        for ( int i : temp){
            if (i > avg){
                count++;
            }
        }
        System.out.println(count + " day above average");
    }
}
