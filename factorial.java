
import java.math.BigInteger;

// in this code we will learn that how to get value of facotorial number . In bigInteger format. ot math module

class factorial {

    public static void main(String[] args) {

 int x=90;

 BigInteger ans= new BigInteger("1");

 for(int i=1; i<= x; i++){

    BigInteger temp= new BigInteger(i+ "");

   ans= ans.multiply(temp);
 }        

 System.out.println( ans);

    }
    
    
    }
