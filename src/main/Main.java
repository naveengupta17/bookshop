package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Book[] books = new Book[n]; // many object of book class

        if (n == 0) {
            System.out.println("N/A");
        } else {
            scan.nextLine().trim();
            for (int i = 0; i < n; i++) {
                String name = scan.nextLine();
                String aname = scan.nextLine();
                String isbn = scan.nextLine();
                books[i] = new Book(name, aname, isbn);

            }
        }
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        scan.close();
    }


    }



