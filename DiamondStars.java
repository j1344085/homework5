package examforwhilestars;

import java.util.*;
import java.io.*;

public class DiamondStars {
    DiamondStars(){
        System.out.print("===============================\n");
        System.out.print("다이아몬드의 크기입력 : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        size = size/2;
        System.out.print("\n");
        
        for(int i=0; i<size; i++){
            for(int j=1; j<size-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i*2+1; k++){
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
        for(int i=size; i>=0; i--){
            for(int j=1; j<size-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i*2+1; k++){
                System.out.print("*");
            }
            
            System.out.print("\n");
        }
        
       System.out.print("\n");
    }
}
