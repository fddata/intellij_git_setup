public class Cat {

    private int age;
    private String name;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String meow(){
        return "Meow";
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}