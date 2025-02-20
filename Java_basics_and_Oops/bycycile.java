

class Stand{

    int x;
    String y;

    public void Unlock(){
         
         System.out.println(this.x);
        System.out.println("Cycle Unlock");
        System.out.println(" 2 hours");

    }
    public void lock(){

System.out.println(this.x);
System.out.println("Cycile lock");
System.out.println("Successfully");

    }
}

public class bycycile{

    public static void main(String[]args){

Stand st1= new Stand();

st1.x=10;
st1.y= "payment done";

 Stand st2= new Stand();

 st2.x=0;
 st2.y="not payment";

 st1.Unlock();
 st2.lock();


    }


}