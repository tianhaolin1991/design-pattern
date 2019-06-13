package com.designprinciple.liskovSubstitution.doo;

/**
 * 通过里氏替换原则杜绝了继承的滥用,Rectangle和Square不能作为参数传入同一个方法
 */
public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        System.out.println("==================================");
        Square square = new Square();
        rectangle.setLength(20);
        resize2(square);
    }

    private static void resize(Rectangle rectangle){
        while(rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth());
        }
        System.out.println("resize方法结束,width: "+ rectangle.getWidth());
    }

    private static void resize2(Square rectangle){
        while(rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth());
        }
        System.out.println("resize方法结束,width: "+ rectangle.getWidth());
    }
}
