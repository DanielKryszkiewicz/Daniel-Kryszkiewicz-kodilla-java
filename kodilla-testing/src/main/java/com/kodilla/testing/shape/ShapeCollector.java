package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> shapeList = new ArrayList<>();

    double getShapeListSize(){
        return shapeList.size();
    }
    void addFigure(Shape shape) {
        shapeList.add(shape);

    }

    void removeFigure(Shape shape){
        shapeList.remove(shape);

    }

    Shape getFigure(int n){
       return shapeList.get(n);
    }

    public String showFigures() {
        String result = "";
        for (Shape shapeName : shapeList) {
            result = shapeName.getShapeName();
        }
        return result;
    }
}
