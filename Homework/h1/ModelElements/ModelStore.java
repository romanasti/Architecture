package h1.ModelElements;

import java.util.List;

public class ModelStore {
    private List<Scene> scenes;
    
    public ModelStore() { 
        // TODO
    }
  
    public Scene getScene(int id) {
        return scenes.get(id);
        // TODO
    }

    public Model getModel(int id) {
        return null;
        // TODO
    }    
}
