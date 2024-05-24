package org.tempmahmoud;

import java.security.SecureRandom;
import java.util.Scanner;

// Simple code by TempException || Mahmoud

public class Main {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int CODE_LENGTH = 24;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of codes to generate: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++){
            String finalNitroCode = generateRandomCode(CODE_LENGTH);
            System.out.println("CODE | discord.gift/"+finalNitroCode+" ["+(i + 1)+"]");
        }

        scanner.close();
    }

    public static String generateRandomCode(int length){
        SecureRandom random = new SecureRandom();
        StringBuilder code = new StringBuilder(length);

        for (int i=0; i < length; i++){
            int index = random.nextInt(CHARACTERS.length());
            code.append(CHARACTERS.charAt(index));
        }

        return code.toString();
    }
}
