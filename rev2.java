
// here the code reverse in two chance

class rev2 {

    public static void main(String []args){

        String str="I like prgramming";
        String rev="";

        for(int i=str.length()-1;i>=0;i--){

rev+= str.charAt(i);
        }
     System.out.println(rev);
    }
}