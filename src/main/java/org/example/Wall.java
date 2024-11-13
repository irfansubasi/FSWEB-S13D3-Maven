package org.example;

public class Wall {

    double width;
    double height;


    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double setWidth(double num) {
        return width = (num < 0) ? 0 : num;
    }

    public double setHeight(double num) {
        return height = (num < 0) ? 0 : num;
    }

    public double getArea() {
        return width * height;
    }
}
