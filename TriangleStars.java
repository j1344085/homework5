package examforwhilestars;

import java.util.*;
import java.io.*;

public class TriangleStars {
    TriangleStars(){
        System.out.print("===============================\n");
        System.out.print("직각삼각형의 왼쪽여백과 높이입력 : ");
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int size2 = s.nextInt();
        
        System.out.print("\n");
        
        for(int i=0; i<size2; i++){
            for(int j=0; j<size1-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
    System.out.print("\n"); 
    }    
}
