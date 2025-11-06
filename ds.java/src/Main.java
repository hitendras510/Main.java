import java.util.Scanner;
////
////public class Main {
////   public static void main(String[] args) {
////       Scanner sc = new Scanner(System.in);
////
////       System.out.println("Enter integer:");
////       int a = sc.nextInt();
////
////       System.out.println("Enter double:");
////     double b = sc.nextDouble();
////
////       System.out.println("Enter the single word:");
////       String c = sc.next();
////
////       sc.nextLine();
////
////       System.out.println("Enter the full line");
////       String d = sc.nextLine();
////
////       System.out.println("Integer:" + a);
////       System.out.println("double:" + b);
////       System.out.println("word:" + c);
////       System.out.println("Line:" + d);
////}
////
////}
//
////type casting
//
//class Main {
//    public static void main(String[] args) {
//
//        String str = "Hello";
//        char[] ch = str.toCharArray();
//
//        System.out.println("Reversed string:");
//
//
//        for (int i = ch.length - 1; i >= 0; i--) {
//            System.out.print(ch[i]);
//        }
//
//        System.out.println();
//    }
//}
//
//
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.nextLine();
        String b = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            b += word.charAt(i);
        }

        if (word.equals(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }







//        String str="Hello";
//        String str1="Hello;
//String str=new String("Hello");
//String str1=new String("Hello");
//
//System.out.println(str==str1);
//System.out.println(str.equals(str1));


//        System.out.println("length of string:"+ str.length());
//        System.out.println("char of string at defined index:"+ str.charAt(1));
//        System.out.println("char to uppercase:"+ str.toUpperCase());
//        System.out.println("char to lower case:"+ str.toLowerCase());
//        System.out.println(":"+ str.trim());
//        System.out.println("starting point with given index no.:"+ str.substring(2));
//        System.out.println("start and end point as need :"+ str.substring(1 , 4));
//        System.out.println("index number:"+ str.indexOf(str));



















    }
}

