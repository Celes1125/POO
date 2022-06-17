package com.company;

public class Book {
    //Atributos
    public String title;
    public String author;
    public String isbn;


    //Métodos constructores

    //public Book () {} sería el contructor vacío, sin parámetros

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;    }


    //Otros métodos

    public void showBookInfo () {
        System.out.println("Información del libro: ");
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}