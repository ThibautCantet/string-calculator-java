package visitor.visitor;

import java.util.List;

import visitor.element.Body;
import visitor.element.Breaks;
import visitor.element.Engine;
import visitor.element.Shield;

public interface CarElementVisitor {
    void visit(Body body);
    void visit(Shield shield);
    void visit(Engine engine);
    void visit(Breaks breaks);

    List<String> getElementNames();
}
