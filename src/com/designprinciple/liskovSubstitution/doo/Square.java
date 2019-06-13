package com.designprinciple.liskovSubstitution.doo;

public class Square extends Quadrangle{

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getLength() {
        return super.getLength();
    }

    @Override
    public long getWidth() {
        return super.getWidth();
    }

    public void setLength(long length){
        this.sideLength = length;
    }

    public void setWidth(long width){
        this.sideLength = width;
    }
}
