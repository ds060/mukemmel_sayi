package mukemmel;

import java.util.Scanner;

public class mukemmel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int num = inp.nextInt();
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count += i;
            }
        }

        if (num == count) {
            System.out.println(num + " Bir mükemmel sayıdır");
        } else {
            System.out.println(num + " Bir mükemmel sayı değildir");
        }
    }
}

