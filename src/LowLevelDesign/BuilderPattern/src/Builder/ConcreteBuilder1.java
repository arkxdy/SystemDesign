package Builder;

import java.util.ArrayList;
import java.util.List;

public class ConcreteBuilder1 extends Builder{
    public Builder setParts(){
        List<String> parts = new ArrayList<>();
        parts.add("Q");
        parts.add("W");
        parts.add("R");
        parts.add("T");
        parts.add("Y");
        this.parts = parts;
        return this;
    }
}
