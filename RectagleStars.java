package examforwhilestars;

import java.util.*;
import java.io.*;

public class RectagleStars {
    RectagleStars(){
        System.out.print("===============================\n");
        System.out.print("정사각형 크기입력 : ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        
        System.out.print("\n");
        
        for(int i=0; i<(size/2); i++){
            for(int j=0; j<size; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
