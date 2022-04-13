package visitor.element;

import visitor.visitor.CarElementVisitor;

public class Body implements CarElement {

    @Override
    public String name() {
        return "body";
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

}
