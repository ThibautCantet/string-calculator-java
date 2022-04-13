package visitor.element;

import visitor.visitor.CarElementVisitor;

public class Engine implements CarElement {

    @Override
    public String name() {
        return "engine";
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
