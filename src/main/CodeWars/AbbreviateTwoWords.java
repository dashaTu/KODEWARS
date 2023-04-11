package CodeWars;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] na = name.toUpperCase().split(" ");
        char firstname = na[0].charAt(0);
        char lastname = na[1].charAt(0);

        return  name = firstname + "."+ lastname;
    }

}
