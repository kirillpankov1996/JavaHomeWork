package com.pb.pankov.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Гроздья гнева","Джон Стейнбек","1939");
        Book book2 = new Book("Пикник на обочине","Аркадий и Борис Стругацкие","1972");
        Book book3 = new Book("Дары волхвов","О. Генри","1905");
        Reader reader1 = new Reader("Роликов А.Н.","11111","ЭМС13","27.05.1996","+38095123123");
        Reader reader2 = new Reader("Коньков Л.К.","11112","ЭМС13","13.06.1995","380951231233");

        System.out.println("Перечень книг библиотеки:");
        System.out.println("\t"+book1.getInfo());
        System.out.println("\t"+book2.getInfo());
        System.out.println("\t"+book3.getInfo());

        System.out.println("\nПеречень читателей:");
        System.out.println("\t"+reader1.getInfo());
        System.out.println("\t"+reader2.getInfo());

        System.out.println("\nЧитатели берут книги.");
        reader1.takeBook(book1, book2, book3);
        reader2.takeBook(book1, book3);
        System.out.println("\n");
        reader1.takeBook(book1.getTitle(), book2.getTitle(), book3.getTitle());
        reader2.takeBook(book2.getTitle(), book3.getTitle());

        System.out.println("\nЧитатели возвращают книги.");
        reader1.returnBook(book3, book2, book1);
        reader2.returnBook(book2, book1);
        System.out.println("\n");
        reader1.returnBook(book2.getTitle(), book3.getTitle(), book1.getTitle());
        reader2.returnBook(book3.getTitle(), book1.getTitle());

    }
}
