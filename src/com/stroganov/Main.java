package com.stroganov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)  {
	// write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            try {

                String name = reader.readLine();
                if (name.equals("exit")){
                    break;
                }
                System.out.println("Nice to meet you, " + name);


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("We have got an error:" + e.getMessage());
                break;
            }

        }

    }
}
