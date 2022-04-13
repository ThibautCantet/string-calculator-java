package visitor.element;

import visitor.visitor.CarElementVisitor;

public class Shield implements CarElement {
    @Override
    public String name() {
        return "shield";
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
