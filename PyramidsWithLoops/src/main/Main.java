/*
 * Courtney Jo Young
 * young2cj@mail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/

package main;
public class Main {
    public static void main(String[] args) {
        int rows = 5, k = 0, count = 0, count2 = 0;
        for(int i = 1; i <= rows; ++i) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }
            while(k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i ) + " ");
                    ++count;
                }
                else {
                    ++count2;
                    System.out.print((i) + " ");
                }
                ++k;
            }
            count2 = count = k = 0;
            System.out.println();
        }
    }
}