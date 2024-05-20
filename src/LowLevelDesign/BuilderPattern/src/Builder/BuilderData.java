package Builder;

public class BuilderData {
    String partA;
    String partB;
    String partC;
    String partD;
    String partE;
    String partF;
    String partG;
    String partH;

    public BuilderData(Builder builder){
        this.partA = builder.partA;
        this.partB = builder.partB;
        this.partC = builder.partC;
        this.partD = builder.partD;
        this.partE = builder.partE;
        this.partF = builder.partF;
        this.partG = builder.partG;
        this.partH = builder.partH;
    }

    public String toString(){
        return "" + " A: " + this.partA +
                " B: " + this.partB +
                " C: " + this.partC +
                " D: " + this.partD +
                " E: " + this.partE +
                " F: " + this.partF +
                " G: " + this.partG +
                " H: " + this.partH;
    }
}
