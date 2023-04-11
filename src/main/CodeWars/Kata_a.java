package CodeWars;

public class Kata_a {
    public static String position(char alphabet) {
        char[] abc = new char[]
                {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int a = 0;

        for (int i = 1; i < abc.length; i++) {
            if(abc[i]==alphabet) {
                a = i;



            }

        }
        return "Position of alphabet: " + a;
    }
}
