package visitor;

import java.util.List;

import visitor.element.CarElement;
import visitor.visitor.CarElementVisitor;

public class Car {

    private final List<CarElement> elements;
    private List<String> elementNames;

    public Car(List<CarElement> elements) {
        this.elements = elements;
    }

    public void build(CarElementVisitor visitor) {
        for (CarElement element : elements) {
            element.accept(visitor);
        }
        elementNames = visitor.getElementNames();
    }

    public List<String> getElementNames() {
        return elementNames;
    }

}
