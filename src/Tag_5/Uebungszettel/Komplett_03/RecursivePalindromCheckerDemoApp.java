package Tag_5.Uebungszettel.Komplett_03;

import java.util.ArrayList;

public class RecursivePalindromCheckerDemoApp {
    public static void main(String[] args) {

        ArrayList<Character> chars1 = new ArrayList<>();
        chars1.add('a');
        System.out.println("chars1 = " + chars1);
        System.out.println("'a' = " + checkPalindrom(chars1));
        System.out.println();
        chars1.add('b');
        System.out.println("chars1 =" + chars1);
        System.out.println("'ab' = " + checkPalindrom(chars1));
        System.out.println();
        chars1.add('a');
        System.out.println("chars1 = " + chars1);
        System.out.println("'aba' = " + checkPalindrom(chars1));
        System.out.println();
        chars1.clear();
        chars1.add('a');
        chars1.add('b');
        chars1.add('c');
        chars1.add('c');
        chars1.add('b');
        chars1.add('a');
        System.out.println("chars1 = " + chars1);
        System.out.println("'abccba' = " + checkPalindrom(chars1));
        System.out.println();
        chars1.clear();
        chars1.add('a');
        chars1.add('b');
        chars1.add('c');
        System.out.println("chars1 = " + chars1);
        System.out.println("'abc' = " + checkPalindrom(chars1));

    }

    public static boolean checkPalindrom(ArrayList<Character> chars) {

        ArrayList<Character> chars1 = new ArrayList<>();
        chars1 = chars;

        if (chars1.isEmpty()) {
            return true;
        }
        if (chars1.size() == 1) {
            return true;
        }
        if (chars1.get(0) == chars1.getLast()) {
            chars1.removeFirst();
            chars1.removeLast();
            return checkPalindrom(chars1);
        }
        else {
        return false;
        }
    }
}
