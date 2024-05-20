package Builder;

public class Director {
    Builder builder;

    Director(Builder builder){
        this.builder = builder;
    }

    public  BuilderData createBuilder(){
        if(builder instanceof ConcreteBuilder1){
            return createConcrete1();
        }
        if(builder instanceof ConcreteBuilder2){
            return createConcrete2();
        }
        return null;
    }
    private BuilderData createConcrete1(){
        return builder.setPartA("A").setPartB("B").setPartC("C").setPartD("D").setParts().build();
    }
    private BuilderData createConcrete2(){
        return  builder.setPartE("E").setPartF("F").setPartG("G").setPartH("H").setParts().build();
    }

}
