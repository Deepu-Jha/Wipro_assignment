package wipro_training_day_5;

import java.util.Scanner;

final class SecurityModule {

    void encrypt(String data) {
        System.out.println("Encrypted data: " + data);
    }
}

public class encryption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data:");
        String data = sc.next();

        SecurityModule obj = new SecurityModule();
        obj.encrypt(data);
    }
}
