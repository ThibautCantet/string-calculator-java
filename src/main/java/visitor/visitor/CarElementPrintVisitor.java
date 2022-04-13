package visitor.visitor;

import java.util.ArrayList;
import java.util.List;

import visitor.element.Body;
import visitor.element.Breaks;
import visitor.element.Engine;
import visitor.element.Shield;

public class CarElementPrintVisitor implements CarElementVisitor {

    private List<String> elementNames = new ArrayList<>();
    @Override
    public void visit(Body body) {
        System.out.println(body.name());
        elementNames.add(body.name());
    }

    @Override
    public void visit(Shield shield) {
        System.out.println(shield.name());
        elementNames.add(shield.name());
    }

    @Override
    public void visit(Engine engine) {
        System.out.println(engine.name());
        elementNames.add(engine.name());
    }

    @Override
    public void visit(Breaks breaks) {
        System.out.println(breaks.name());
        elementNames.add(breaks.name());
    }

    @Override
    public List<String> getElementNames() {
        return elementNames;
    }
}
