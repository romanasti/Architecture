package h1.ModelElements;

public class Flash extends Model {
    public Point3D location;
    public Angle3D angle;
    public Color Color;
    public Float Power;
    // TODO

    public Flash(int id, Point3D location, Angle3D angle, Color Color, Float Power) {
        
        super(id, location, angle);
        this.location = location;
        this.angle = angle;
        this.Color = Color;
        this.Power = Power;
    }

    @Override
    public void move(Point3D point) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void rotate(Angle3D angle) {
        // TODO Auto-generated method stub
        
    }
}
