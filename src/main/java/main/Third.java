package main;

import java.util.Scanner;

public class Third {
    public static void main(String args[]) {
        String word, yangi = " ";
        System.out.print( "so'z kirirting:  " );
        try {
            Scanner scanner = new Scanner( System.in );
            word = scanner.nextLine();
            for (int i = 0; i < word.length(); i++) {
                char ch = Character.toLowerCase( word.charAt( i ) );
                switch (ch) {
                    case 'a':
                        yangi = yangi + "t";
                        break;
                    case 'b':
                        yangi = yangi + "c";
                        break;
                    case 'c':
                        yangi = yangi + "d";
                        break;
                    case 'd':
                        yangi = yangi + "o";
                        break;
                    case 'e':
                        yangi = yangi + "p";
                        break;
                    case 'f':
                        yangi = yangi + "f";
                        break;
                    case 'g':
                        yangi = yangi + "*";
                        break;
                    case 'h':
                        yangi = yangi + "e";
                        break;
                    case 'i':
                        yangi = yangi + "f";
                        break;
                    case 'j':
                        yangi = yangi + "o";
                        break;
                    case 'k':
                        yangi = yangi + "p";
                        break;
                    case 'l':
                        yangi = yangi + "a";
                        break;
                    case 'm':
                        yangi = yangi + "*";
                        break;
                    case 'n':
                        yangi = yangi + "k";
                        break;
                    case 'o':
                        yangi = yangi + "l";
                        break;
                    case 'p':
                        yangi = yangi + "*";
                        break;
                    case 'q':
                        yangi = yangi + "*";
                        break;
                    case 'r':
                        yangi = yangi + "s";
                        break;
                    case 's':
                        yangi = yangi + "t";
                        break;
                    case 't':
                        yangi = yangi + "e";
                        break;
                    case 'u':
                        yangi = yangi + "f";
                        break;
                    case 'v':
                        yangi = yangi + "*";
                        break;
                    case 'w':
                        yangi = yangi + "*";
                        break;
                    case 'x':
                        yangi = yangi + "*";
                        break;
                    case 'y':
                        yangi = yangi + "*";
                        break;
                    case 'z':
                        yangi = yangi + "*";
                        break;
                }
            }
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
        System.out.println( "shifr matn: \n" + yangi );
    }
}

