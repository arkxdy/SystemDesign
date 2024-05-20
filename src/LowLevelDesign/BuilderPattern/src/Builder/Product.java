package Builder;

public class Product {
    public void runBuilder(){
        Director directorObj1 = new Director(new ConcreteBuilder1());
        Director directorObj2 = new Director(new ConcreteBuilder2());

        BuilderData builderData1 = directorObj1.createBuilder();
        BuilderData builderData2 = directorObj2.createBuilder();

        System.out.println(builderData1.toString());
        System.out.println(builderData2.toString());
    }
}
