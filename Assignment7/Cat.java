public class Cat extends Animal implements Pet {
    private String name;

    public Cat(){
        super(4);
        this.name = "";
    }

    public Cat(String name){
        super(4);
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
        System.out.println("cat is playing");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Cat is eating");
    }
}
