
import java.util.Scanner;

// this code for get input in 2d array . 

class dninput{

    public static void main(String[] args) {
        
           Scanner sc= new Scanner(System.in);

           int rows = sc.nextInt();
           int clos = sc.nextInt();

        int [][] a=  new int [rows][clos];
 for (int i=0; i<a.length; i++){

        for (int j=0; j< a[i].length; j++){

             a[i][j]= sc.nextInt();
        }

 }

for (int i=0; i<a.length; i++){

        for (int j=0; j< a[i].length; j++){

            System.out.println(a[i][j] + " ");
        }
                
                System.out.println();
    }
    
    }

    }
