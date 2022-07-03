package main;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
        System.out.println(" n kiriting: ");
        int n=scanner.nextInt();
        if(n<5 && n>=1){
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
}
