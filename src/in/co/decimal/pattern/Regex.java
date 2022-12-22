package in.co.decimal.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String mobile = "8789782803";
        String mobile2 = "87678";
        System.out.println(mobile.matches("[1-9][0-9]{9}"));
        System.out.println(mobile.matches("[1-9]\\d{9}"));
        System.out.println(mobile2.matches("[1-9][0-9]{9}"));


        Pattern mobP = Pattern.compile("[1-9][0-9]{9}");
        Matcher m1 = mobP.matcher(mobile);
        System.out.println(m1.matches());



    }
}
