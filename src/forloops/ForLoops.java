/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloops;

/**
 *
 * @author Benjamin Wong
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        printStar();
//        printAlphaNumNine("B");
//        printRepeatAlphaNum("T", 6);
//        printStarGrid(9, 3);
//        printDescending();
//        printDescendingValue(10);
//        countdownValue(10);
//        printTimesTable(5, 4);
//        printFormattedTimesTable(8, 8);
//        printSum(20, 25);
        zigZagZug();
    }
    
    public static void printStar(){
        for (int i = 0; i < 7; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static void printAlphaNumNine(String string){
        for (int i = 0; i < 9; i++){
            System.out.print(string);
        }
        System.out.println("");
    }
    
    public static void printRepeatAlphaNum(String string, int j){
        System.out.printf("Repeat AlphaNum (%s, %d) \n----------------------\n", string, j);
        for (int i = 0; i < Math.abs(j); i++){
            System.out.print(string);
        }
        System.out.println("");
    }
    
    public static void printStarGrid(int x, int y){
        for (int i = 0; i < y; i++){
            for (int j = 0; j < x; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void printDescending(){
        for (int i = 7; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void printDescendingValue(int k){
        for (; k > 0; k--){
            for (int j = 0; j < k; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void countdownValue(int k){
        for (; k > 0; k--){
            System.out.println(k);
        }
        System.out.println("...Liftoff!\n");
    }
    
    public static void printTimesTable(int columns, int rows){
        for (int row = 0; row <= rows; row++){
            for (int column = 0; column <= columns; column++){
                System.out.print((column * row) + "   ");
            }
            System.out.println("");
        }
    }
    
    public static void printSum(int startValue, int endValue){
        int value = 0;
        for (int i = startValue; i < endValue; i++) {
            value += i;
        }
        System.out.println(value);
        System.out.println("");
    }

    
//9) Write a java method called “zigZagZug()” that uses a for loop to list up the integers from 1 to 100, and for each number, prints next to that number “Zig” if the number is evenly divisible by 2, and “Zag” if the number is evenly divisible by 3, and then “Zug” if that number is evenly divisible by 5.  (Hint: use the modulus operator %. e.g. 10 % 3 = 1, 11 % 3 = 2, 12 % 3 = 0). The output should look like:
//
    
    public static void zigZagZug(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ")");
            if (i % 2 == 0){
                System.out.print(" Zig");
            }
            if (i % 3 == 0){
                System.out.print(" Zag");
            }
            if (i % 5 == 0){
                System.out.print(" Zug");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void printFormattedTimesTable(int columns, int rows){
        System.out.print("     ");
        for (int column = 0; column <= columns; column++){
            System.out.print(column + "   ");
        }
        System.out.println("");
        System.out.print("   ---");
        for (int column = 0; column < columns; column++){
            System.out.print("----");
        }
        System.out.println("");
        for (int row = 0; row <= rows; row++){
            System.out.print(row + " |  0");
            for (int column = 1; column <= columns; column++){
                int product = column * row;
                System.out.printf("%4d", product);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    
}
