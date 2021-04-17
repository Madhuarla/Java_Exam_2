/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;
import java.util.Scanner;

/**
 *
 * @author Madhu Babu Arla 
 */
public class Answer2 {
    public static void main(String[] args) {
        System.out.println("question number 2 by Madhu Babu Arla");
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[i].length; j++)
                m1[i][j] = input.nextInt();
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++)
            for (int j = 0; j < m2[i].length; j++)
                m2[i][j] = input.nextInt();
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical.");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }
    

    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length) return false;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) return false;
            }
        }
        return true;
        
    }
    
    
}
