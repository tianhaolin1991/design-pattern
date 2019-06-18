package com.designPattern.create.prototype.listclone;

import java.util.ArrayList;
import java.util.List;

/**该例子用来模拟List的clone
 * @author:tianhaolin
 * @version:1.0
 */
public class Library implements Cloneable{

    List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                '}'+super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Library clone = (Library)super.clone();
        clone.setBookList(new ArrayList<Book>(this.bookList));
        return clone;
    }
}
