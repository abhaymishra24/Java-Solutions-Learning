
// in this code we will learn how to revers string arguments.

public class reversstring{

	public static void main(String[] args) {
		String str = "abhay";

		System.out.println(reverse(str));
	}

	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}

}



// class StringReverse
// {
//     /* Function to print reverse of the passed string */
//     void reverse(String str)
//     {
//         if ((str==null)||(str.length() <= 1))
//            System.out.println(str);
//         else
//         {
//             System.out.print(str.charAt(str.length()-1));
//             reverse(str.substring(0,str.length()-1));
//         }
//     }
     
//     /* Driver program to test above function */
//     public static void main(String[] args) 
//     {
//         String str = "Geeks for Geeks";
//         StringReverse obj = new StringReverse();
//         obj.reverse(str);
//     }    
// }