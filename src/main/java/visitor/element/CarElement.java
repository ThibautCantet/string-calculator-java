package visitor.element;

import visitor.visitor.CarElementVisitor;

public interface CarElement {
    String name();
    void accept(CarElementVisitor visitor);
}
