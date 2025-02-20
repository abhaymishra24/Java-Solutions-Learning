
// write code for class and object.

class Pen{

    int x;
    String y;

public void write(){

    System.out.println("write my name: Abhay ");
}

public void color(){
    System.out.println(this.y);
}
    }

public class manu {

public static void main(String []args){
 Pen pen1= new Pen(); 

 pen1.x= 25;
 pen1.y= "Blue";

 pen1.write();

 Pen pen2= new Pen();
 pen2.x=30;
 pen2.y="black";


pen1.color();
pen2.color();
     }

}
