package bucles2;

import java.util.Scanner;

public class bucles2_fermat {

    public static void main(String[] args) {

        int n=1;

        for(int i = 0; i<10; i++){
            System.out.println(Math.pow(2, n)+1);
            n*=2;
        }

    }
}
