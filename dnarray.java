
// this code for dainamic array 

class dnarray{

    public static void main (String[]args){

        int row= 3;
        int colm= 4;

        int [][]a= new int[row][colm];

        a[1][2]=12;

        System.out.println(a[1][2]);
        System.out.println(a[1][3]);
    }
}