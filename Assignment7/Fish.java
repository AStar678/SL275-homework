public class Fish extends Animal implements Pet{
    private String name;
    
    public Fish(){
        super(0);
        name = "";
    }

    public Fish(String name){
        super(0);
        this.name = name;
    }
    
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Fish is playing");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Fish is eating");
    }

    public void walk(){
        System.out.println("Fish can't walk");
    }
    
}
