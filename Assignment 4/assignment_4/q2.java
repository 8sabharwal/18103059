import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int nm = -1;
        byte b = (byte)nm;
        int n = b;
        char c = (char)b, c1 = (char)n;
        int fnm = c;
        System.out.println("Initial int: "+ nm);
        System.out.println("Then Byte: "+ b + " " + n + " " + c1);
        System.out.println("Then Character: "+ c);
        System.out.println("Final int: "+ fnm);
    }
}

/* Integer to byte: Range of byte: -2^7 to 2^7+1 because byte is signed
Therefore -1 remains -1.
Byte to char: The byte is first converted to int and then
int is converted to char.
Char to int: char is of 16 bits whereas int is of 32 bits.So, the
answer is 2^16 - value of char */