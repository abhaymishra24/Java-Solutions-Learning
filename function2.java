class Main{

          static int square(int num){
          return num*num;
          }

          static void hello(){
            System.out.println("hello Abhay");
          }
          static String[] heros(){
                String[] superheros={"Abhay Mishra","Alok beta ", "Anurag","Shivendra"};
                return superheros;
            }

            static int add(int a, int b){
                System.out.println("add number:");
                return a+b;
            }

            static String add(String a, String b){
                System.out.println("add Spelling:");
                return a+b;
            }

            

          public static void main(String []args){
             System.out.println(square(4));
             System.out.println(square(8));
             hello();

             

            String[] arr= heros();
    for (String heros: arr){
        System.out.println(heros);
    }

    System.out.println(add(5,10));
    System.out.println(add("Hi","Abhay"));
          }
    }