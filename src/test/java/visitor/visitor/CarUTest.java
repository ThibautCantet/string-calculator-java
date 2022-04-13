package visitor.visitor;

import java.util.List;

import org.junit.jupiter.api.Test;
import visitor.element.Body;
import visitor.Car;
import visitor.element.Breaks;
import visitor.element.CarElement;
import visitor.element.Engine;
import visitor.element.Shield;

import static org.assertj.core.api.Assertions.*;

class CarUTest {

    @Test
    void build_should_create_list_with_all_elements_names() {
        List<CarElement> elements = List.of(new Shield(), new Body(), new Engine());
        Car car = new Car(elements);
        CarElementPrintVisitor visitor = new CarElementPrintVisitor();

        car.build(visitor);

        assertThat(visitor.getElementNames()).containsExactlyInAnyOrder("shield", "body", "engine");
    }

    @Test
    void build_should_create_list_with_all_elements_names_with_new_breaks_element() {
        List<CarElement> elements = List.of(new Shield(), new Body(), new Engine(), new Breaks());
        Car car = new Car(elements);
        CarElementPrintVisitor visitor = new CarElementPrintVisitor();

        car.build(visitor);

        assertThat(visitor.getElementNames()).containsExactlyInAnyOrder("shield", "body", "engine", "breaks");
    }
}
