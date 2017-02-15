package mt.composite;

import java.util.ArrayList;
import java.util.List;

public class TextComposite extends Component {
    private List<Component> components = new ArrayList<>();

    public TextComposite() {
    }

    public TextComposite(ComponentType type) {
        this.type = type;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Component component : components) {
            stringBuilder.append(component.toString());
        }
        return stringBuilder.toString();
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}



