package visitor.element;

import visitor.visitor.CarElementVisitor;

public class Breaks implements CarElement {
    @Override
    public String name() {
        return "breaks";
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
