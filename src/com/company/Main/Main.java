package com.company.Main;

public class Main {

    public static void main(String[] args) {
        String message = "how are you doing today";
        int offset = 12;

        CaeserCipher caesarsCipher = new CaeserCipher();

        String cipheredMessage = caesarsCipher.cipher(message,offset);
        System.out.println("Message:" + message + "\n" + "offset: " + offset + "\n" + "Ciphered Message: " + cipheredMessage);

    }
}
