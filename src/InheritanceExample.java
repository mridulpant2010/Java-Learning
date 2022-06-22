class Animal{
    void run(){
        System.out.println("I am running");
    }
}
class Bird extends Animal {

}

public class InheritanceExample {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.run();
    }
}
