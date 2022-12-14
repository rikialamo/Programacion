package bucles2;

import java.util.Scanner;

public class ej_18 {

    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            int i = 2;
            boolean bool = false;

            while (i < n && !bool) {
                if ((n % i) == 0) {
                    bool = true;
                } else {
                    i++;
                }
            }
            if (!bool) {
                System.out.print(n + ", ");
            }
        }
    }
}
