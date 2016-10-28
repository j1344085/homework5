package examforwhilestars;

import java.util.*;
import java.io.*;

public class ExamForWhileStars {

    public static void main(String[] args) throws IOException {
    
        while (true) {
            System.out.println("*******************");
            System.out.println(" 반복문 연습하기2");
            System.out.println("*******************");
            Scanner s = new Scanner(System.in);
            
            System.out.println("1. 정사각형 별찍기");
            System.out.println("2. 직각삼각 별찍기");
            System.out.println("3. 이등변삼각형 별찍기");
            System.out.println("4. 다이아몬드 별찍기");
            System.out.println("5.  종료하기");
            System.out.print("원하는 메뉴는>> ");
            int menu = s.nextInt();

            switch (menu) 
            {
                case 1:
                    new RectagleStars();
                    break;
                case 2:
                    new TriangleStars();
                    break;
                case 3:
                    new IsoscelesTriangleStars();
                    break;
                case 4:
                    new DiamondStars();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default :
                    System.out.print("잘못 입력하셨습니다.\n");
                    break;

            }  
        }
    }
    
}
