package org.example.ModelElements;


import org.example.Stuff.Angle3D;
import org.example.Stuff.Point3D;

public class Camera {
    public Point3D Location;
    public Angle3D Angel;

    public Camera(Point3D location, Angle3D angel) {
        Location = location;
        Angel = angel;
    }

    public void Rotate(Angle3D Angel){}
    public void Move(Point3D Location){}
}
