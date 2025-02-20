class varr{

    static float getAvg(float...varargs){

        System.out.println(varargs.getClass().getSimpleName());

        int total= 0;
         for(float num:varargs){
             total+=num;
         }
return total/varargs.length;
    }
    public static void main(String[] args){
       
       float avg1= getAvg(2,3,4,5,6,7);
       float avg2= getAvg(2,3,4);

       System.out.println(avg1);
       System.out.println(avg2);

    }

}

