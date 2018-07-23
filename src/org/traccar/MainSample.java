package org.traccar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSample {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String name = reader.readLine();
        } catch (IOException ex) {
            //
        }
    }
}
