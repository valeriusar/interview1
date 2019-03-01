package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException {

        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            Student student = new Student();

            System.out.println("Please enter student's name: ");
            String name = bufferedReader.readLine();
            student.setName(name);

            System.out.println("Please enter student's age: ");
            try {
                int age = Integer.parseInt(bufferedReader.readLine());
                student.setAge(age);

            } catch (NumberFormatException nfe) {
                System.out.println("Invalid format!");
            }

            System.out.println("Please enter student's ID: ");
            try {
                int id = Integer.parseInt(bufferedReader.readLine());
                student.setId(id);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid format!");
            }


            PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
            out.println(student.getName());
            out.println(student.getAge());
            out.println(student.getId());
            out.close();
        }catch (IOException e){
            System.out.println("Error while reading/writing");
        }
    }
}
