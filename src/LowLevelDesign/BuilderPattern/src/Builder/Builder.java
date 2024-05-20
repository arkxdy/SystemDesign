package Builder;

import java.util.List;

public abstract class Builder {
    String partA;
    String partB;
    String partC;
    String partD;
    String partE;
    String partF;
    String partG;
    String partH;

    List<String> parts;

    public Builder setPartA(String partA) {
        this.partA = partA;
        return this;
    }

    public Builder setPartB(String partB) {
        this.partB = partB;
        return this;
    }

    public Builder setPartC(String partC) {
        this.partC = partC;
        return this;
    }

    public Builder setPartD(String partD) {
        this.partD = partD;
        return this;
    }

    public Builder setPartE(String partE) {
        this.partE = partE;
        return this;
    }

    public Builder setPartF(String partF) {
        this.partF = partF;
        return this;
    }

    public Builder setPartG(String partG) {
        this.partG = partG;
        return this;
    }

    public Builder setPartH(String partH) {
        this.partH = partH;
        return this;
    }
    public abstract Builder setParts();

    public BuilderData build(){
        return new BuilderData(this);
    }
}
