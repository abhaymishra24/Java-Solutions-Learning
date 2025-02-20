
// In this code we will solve the sum of two matrixc in 2d array.

import java.util.Scanner;

class ddarray{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int coln= sc.nextInt();

        int [][]a= new int[row][coln];
        int [][]b= new int[row][coln];


        for (int i=0; i <row; i++){

        for (int j=0; j< coln; j++){

             a[i][j]= sc.nextInt();
        }

 }

for (int i=0; i< row; i++){

        for (int j=0; j<  coln; j++){

             b[i][j]= sc.nextInt();
        }
        
    }

    int [][]c= new int[row][coln];

    for (int i=0; i< row; i++){

        for (int j=0; j<  coln; j++){

             c[i][j]= a[i][j]+b[i][j];
        }

    }
    
    }

}


// Here the another way to solve this question with improvment in code.

class ddarray{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int coln= sc.nextInt();

        int [][]a= new int[row][coln];
        int [][]b= new int[row][coln];

        matrixRead (a);
        matrixRead (b);

        int [][]c= new int[row][coln];

    for (int i=0; i< row; i++){

        for (int j=0; j<  coln; j++){

             c[i][j]= a[i][j]+b[i][j];
        }

    }

    }

    static void matrixRead(int [][] mat){

        for (int i= 0; i<mat.length; i++){
            for (int j= 0; j<mat.length; j++){
                mat[i][j]= sc.nextInt();
            }
        }
    }
}