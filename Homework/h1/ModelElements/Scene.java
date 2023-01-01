package h1.ModelElements;

import java.util.List;

public class Scene {
    private int id;
    private int width;
    private int height;
    private List<PoligonalModel> models;
    private List<Camera> cameras;
    private List<Flash> flashes;

    public Scene(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }

    public int addModel(Model model) {
        return models.indexOf(model);
        // TODO
    }
}
