package util;

import java.util.Scanner;

public class InputUtil {
    public static String getString(Scanner sc) {
        return sc.nextLine();
    }
    public static int getInt(Scanner sc) {
        return Integer.parseInt(sc.nextLine());
    }
    public static double getDouble(Scanner sc) {
        return Double.parseDouble(sc.nextLine());
    }
}