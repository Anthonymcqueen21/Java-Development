import java.util.*;
class Solution {
    static String capitalize(String s) {
       return s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
    }
    public static void main(String[] args){
       Scanner cin=new Scanner(System.in);
       System a=cin.next(),b=cin.next();
       System.out.println(a.length()+b.length());
       System.out.println(capitalize(a)+" "+capitalize(b));
    }
}
