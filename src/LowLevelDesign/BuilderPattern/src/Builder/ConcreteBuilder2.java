package Builder;

import java.util.ArrayList;
import java.util.List;

public class ConcreteBuilder2 extends Builder{
    public Builder setParts(){
        List<String> parts = new ArrayList<>();
        parts.add("Z");
        parts.add("X");
        parts.add("V");
        parts.add("N");
        parts.add("M");
        this.parts = parts;
        return this;
    }
}
