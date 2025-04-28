class sb{
    public static void main(String[]arge){
        
        StringBuilder sb= new StringBuilder("I am abhay");
        System.out.println(sb);

        sb.append(" from India");
        System.out.println(sb);

        sb.insert(11, "mishra ");
        System.out.println(sb);

        sb.replace(23, 27, "Lucknow");
        System.out.println(sb);

        sb.delete(25 , 29);
        System.out.println(sb);

        String str= sb.toString();
        System.out.println(str);
        
    }
}