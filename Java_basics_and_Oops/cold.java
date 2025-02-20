

// In this code we will solve the colum to colum print statment of array in @d array.

class cold{

    public static void main(String[]args){

        int [][]arr= {

            {4,5,6,7},
            {10,45,67,7},
            {11,22,33,44}
        };

        int row= arr.length;
        int coln=arr[0].length;

    for (int j=0; j<coln; j++){

        for (int i=0; i<row; i++){

            System.out.println(arr[i][j] + " ");
        }

         System.out.println();
    }
}

}