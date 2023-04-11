package CodeWars;

import redrover.Array;

import java.util.Arrays;

public class KataTrip {
    public static String tripleTrouble(String one,String two, String three) {
        char[] charRes = new char[one.length()*3];
        int indexOfArray = 0;

        for (int i = 0; i < one.length(); i++) {
            charRes[indexOfArray] = one.charAt(i);
            ++indexOfArray;
            charRes[indexOfArray] = two.charAt(i);
            ++indexOfArray;
            charRes[indexOfArray] = three.charAt(i);
            ++indexOfArray;
        }
        return new String(charRes);
    }
//        char[] o = one.toCharArray();
//        char[] t = two.toCharArray();
//        char[] th = three.toCharArray();
//        char a = o[0];
//        char b = t[0];
//        char c = th[0];
//        char a1 = o[1];
//        char b2 = t[1];
//        char c3 = th[1];
//
//        String abc = a +""+ b +""+c+""+a1 +""+ b2 +""+c3;


//        return String.valueOf(abc);


//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i<one.length(); i++) {
//                sb.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
//            }
//            return sb.toString();
//



        // Solution
//    }


}
