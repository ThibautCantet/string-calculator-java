package visitor.visitor;

import visitor.element.Body;
import visitor.element.Engine;
import visitor.element.Shield;

public interface CarElementVisitor {
    void visit(Body body);
    void visit(Shield shield);
    void visit(Engine engine);
}
