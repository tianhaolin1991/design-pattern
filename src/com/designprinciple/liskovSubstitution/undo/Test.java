package com.designprinciple.liskovSubstitution.undo;

/**
 * 当我们把父类替换成子类执行,结果P的运行结果发生了改变,违背了里式替换原则
 */
public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        System.out.println("==================================");
        Rectangle square = new Square();
        rectangle.setLength(20);
        resize(square);
    }

    private static void resize(Rectangle rectangle){
        while(rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth());
        }
        System.out.println("resize方法结束,width: "+ rectangle.getWidth());
    }
}
