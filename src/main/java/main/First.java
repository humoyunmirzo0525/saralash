package main;

public class First {
    public static void main(String[] args) {

       int [][] massiv={
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,0},
               {0,0,0,0,0,0,1}};
        for (int i = 0; i <massiv.length ; i++) {
            for (int j = 0; j <massiv[i].length; j++) {
                if(massiv[i][j]==1){
                    System.out.println(Math.abs(3-i)+Math.abs(3-j));
                }
            }
        }

    }
}
