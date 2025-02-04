package org.anurag;
import java.util.Scanner;
import java.util.Arrays;
public class Task2 {
    public static void main(String args[]) {
        int n, sub;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of students:");
        n = scan.nextInt();
        System.out.println("Enter the number of subjects:");
        sub = scan.nextInt();

        int[][] marks = new int[n][sub];
              for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < sub; j++) {
                System.out.println("Enter marks of subject " + (j + 1) + ":");
                marks[i][j] = scan.nextInt();
            }
        }     
        int sum=0;
        double[] avg=new double[n];
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<sub;j++)
        	{
        		sum=sum+marks[i][j];
        		avg[i]=(double)sum/sub;
            	}
        }
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<sub;j++)
        	{
        		System.out.println("Student"+i+1+"Average="+avg[i]);
        	}
        }
    }
}
