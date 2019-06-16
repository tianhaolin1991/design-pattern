package com.designPattern.simplefactory;

public class VideoFactory {

    Video getInstance(String type){
        if(type.equalsIgnoreCase("Java")){
            return new JavaVideo();
        }else if(type.equalsIgnoreCase("Python")){

            return new PythonVideo();
        }
        return null;
    }
}
