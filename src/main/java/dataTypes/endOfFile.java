package dataTypes;

import java.util.Scanner;

public class endOfFile {
    public static void main ( String[] args ) {

        Scanner sc = new Scanner (System.in);
        System.out.print ("Write something: ");

        for (int i = 1; sc.hasNext ()== true ; i++) {
            System.out.println (i+" "+sc.nextLine ());

        }

    }
}
/*
"In computing, End Of File (commonly abbreviated EOF) is a condition
in a computer operating system where no more data can be read from a
data source." — (Wikipedia: End-of-file)
 */