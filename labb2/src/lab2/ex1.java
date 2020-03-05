package lab2;

import java.util.Scanner;

public class ex1 {

    public static void main(String args){

        int[] studentsAge= new int[25];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i;
        for( i = 0;i < studentsAge.length;i++){

            int value = scanner.nextInt();
            if( value == -1)
            {
                break;
            }else{
                studentsAge[i] = value;
                sum += value;
            }
        }
        System.out.println("The  grade averages is: "+sum/ i );
    }
}
