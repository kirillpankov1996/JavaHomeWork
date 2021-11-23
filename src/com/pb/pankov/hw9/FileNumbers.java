package com.pb.pankov.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    public static void main(String[] args) {
        createNumberFile();
        createOddNumbersFile();
    }

    public static void createNumberFile() {

        StringBuilder numbersData = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                numbersData.append(random.nextInt(99));
                numbersData.append(" ");
            }
            if (i != 9) {
                numbersData.append("\n");
            }
        }

        try (Writer writer = new FileWriter("src/com/pb/Pankov/hw9/numbers.txt")){
            writer.write(numbersData.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createOddNumbersFile() {
        Path path = Paths.get("src/com/pb/Pankov/hw9/numbers.txt");
        StringBuilder oddNumbers = new StringBuilder();

        try (BufferedReader reader = Files.newBufferedReader(path);
             Writer writer = new FileWriter("src/com/pb/Pankov/hw9/odd-numbers.txt")) {

            while (reader.ready()) {
                String[] numbers = reader.readLine().split(" ");
                for (String number : numbers) {

                    int num = Integer.parseInt(number);

                    if (num % 2 == 0) {

                        oddNumbers.append(0);
                    } else {

                        oddNumbers.append(num);
                    }

                    oddNumbers.append(" ");
                }

                oddNumbers.append("\n");
            }

            writer.write(oddNumbers.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}