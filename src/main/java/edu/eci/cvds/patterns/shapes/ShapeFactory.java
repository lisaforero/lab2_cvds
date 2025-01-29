package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.* ;
public class ShapeFactory {


    public static Shape create(RegularShapeType type){
        switch (type){
            case Hexagon:
                Hexagon hexagono = new Hexagon();
                return hexagono;


            case Pentagon:
                Pentagon pentagono = new Pentagon();
                return pentagono;


            case Quadrilateral:
                Quadrilateral cuadrado = new Quadrilateral();
                return cuadrado;


            case Triangle:
                Triangle triangulo = new Triangle();
                return triangulo;

            default:
                return null;
        }
    }
}
