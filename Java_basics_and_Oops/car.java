
// we will start programming of OOPs concept and real world programming

class car{

String module= "honda";
String colour= "white";
int price = 2000;

void drive(){

    System.out.println("ruk ruk ruk");
}
void lock(){
    System.out.println("your car is lock");

}

void unlock(){
    System.out.println("you car is unlock");
}

}

class main{

    public static void main(String[] args) {

        car c1= new car();
        car c2= new car();

        System.out.println(c1.module);
        System.out.println(c2.price);
        System.out.println(c1.colour);

    }
}