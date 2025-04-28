
// iteration over 2d array - in this we code for print the given array and their value as well.

class dnarry{

    public static void main(String[] args) {
        int [][]a= {

            {2,3,4,5},
            {5,6,7,8},
            {9,8,7,6}
             
    };

    for (int i=0; i<a.length; i++){

        for (int j=0; j< a[i].length; j++){

            System.out.println(a[i][j] + " ");
        }

         System.out.println();
    }
    
    }

}
