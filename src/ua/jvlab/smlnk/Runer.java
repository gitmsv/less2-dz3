/*
* This class defines the highness of the year
* Year is user-defined
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
 * @author Sergey Melnyk
 * @date 04.01.2018
 * @version 1.0.0
 */
public class Runer {

    int year;
    double rez4;
    double rez100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите год: ");
        int year = sc.nextInt();

        double rez4 = year % 4;
        double rez100 = year % 100;

        if (rez4 == 0 & rez100 != 0) {
            System.out.println("Год " + year + " высокостный");
        } else {
            System.out.println("Год " + year + " не высокостный");
        }

        sc.close();

    }

}
