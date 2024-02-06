package org.example.ModelElements;

import org.example.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> textures) {
        Textures = textures;
        Poligons = new ArrayList<>();
        Poligons.add(new Poligon(new Point3D()));
    }
}
