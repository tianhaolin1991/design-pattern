package com.designPattern.behavior.templatemethod;

public abstract class ACourse {
    //主流程,不希望被子类修改
    protected final void makeCourse(){
        this.makePPT();
        this.makeVieo();
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVieo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
            System.out.println("编写手记");

    }

    //钩子方法,缺省不使用手记
    protected boolean needWriteArticle(){
        return false;
    }

    abstract void packageCourse();
}
