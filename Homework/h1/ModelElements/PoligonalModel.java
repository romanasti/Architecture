package h1.ModelElements;

public class PoligonalModel extends Model {
    private Poligon poligon;
    private Texture texture;

    public PoligonalModel(int id, Point3D location, Angle3D angle, Poligon pol, Texture txr) {
        super(id, location, angle);
        poligon = pol;
        texture = txr;
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
