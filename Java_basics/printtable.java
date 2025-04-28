

// in this programm we will se that how print the table using by java code

import java.util.Scanner;

class printtable{

    public static void main(String[]args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter the number");

int a= sc.nextInt();


for (int i= 1; i<=10; i++){

    System.out.println(a + "*" + i + "=" + a*i);
}
      
}

}