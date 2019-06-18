package com.designPattern.create.prototype.listclone;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("哈利波特与魔法石",new Date(0L)));
        books.add(new Book("哈利波特3",new Date(666666L)));
        Library library = new Library();
        library.setBookList(books);

        Library cloneLibrary = (Library)library.clone();
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println("================================================================================");
        books.add(new Book("哈利波特4",new Date(999999L)));
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println("================================================================================");
        books.get(0).getStoreDate().setTime(1000000L);
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println("可以看到,虽然我们对list域进行了新的赋值,但当我们修改了List中的Object的时候,clone对象List中的对象也会被修改");
    }
}
