package com.designPattern.create.prototype.listclone;

import java.util.Date;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Book {
    private String name;
    private Date storeDate;

    public Book(String name, Date storeDate) {
        this.name = name;
        this.storeDate = storeDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(Date storeDate) {
        this.storeDate = storeDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", storeDate=" + storeDate +
                '}'+super.toString();
    }
}
