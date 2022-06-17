package com.company;

public class Main {

    public static void main(String[] args) {

        Book myBook = new Book(
                "Las mil y una noches",
                "anónimo",
                "9788408017837"

        );

        System.out.println(myBook.author);
        myBook.showBookInfo();
    }
}
