package h1.ModelElements;

abstract public class Model {

   protected int id;
   protected Point3D location;
   protected Angle3D angle;

    public Model(int id, Point3D location, Angle3D angle) {
        this.id = id;
        this.location = location;
        this.angle = angle;
    }

   abstract public void move(Point3D point);

   abstract public void rotate(Angle3D angle);

}
