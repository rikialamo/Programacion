package timers;

public class printf {
    public static void main(String[] args) {

        System.out.printf("%d\n", ((int)30.6));
        System.out.printf("%f\n", 30.6f);
        System.out.printf("%f\n", 30.6);
        System.out.printf("%s\n",
                "hello world");

        int edad = 20;
        float altura = 1.78f;
        float peso = 5.4f;

        System.out.printf("La edad es %d y la altura es %f", edad, altura);
        System.out.printf("\nLa edad es %d, la altura es %f y pesa %f",
                edad, altura, peso);

        System.out.printf("\n%5d", 3);//formato

        System.out.printf("\n%.2f", 3.5847);//formato decimal

        System.out.printf("\n%02d:%02d", 5, 4);//timer


    }
}
