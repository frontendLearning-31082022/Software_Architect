package org.example.ModelElements;

import org.example.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();

    public Poligon(List<Point3D> points) {
        this.points = points;
    }

    public Poligon(Point3D point3D) {
    }
}
