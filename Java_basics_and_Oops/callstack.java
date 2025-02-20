class call{

public static void main(String[] args) {
    int x=0;
    System.out.println("number print:"+x);
    first ();
    
}

static void first(){
    int x= 10;
    System.out.println("first value print:"+x);
    second();
}
 static void second(){
    int x= 20;
    System.out.println("second value print:"+x);
    third();

 }

 static void third (){
    int x=30;
    System.out.println("third value print:"+x);
 }

}
