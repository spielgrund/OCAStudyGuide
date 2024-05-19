package Constructor;

public class Dog {
    String name;
    int age;
    public Dog(){}
    public Dog(String name){
        this.name = name;
    }
    public Dog(int age){
        this.age = age;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
