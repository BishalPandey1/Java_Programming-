
public class Main {
    public static void main(String[] args) {
        Tiger obj = new Tiger();
    }
}
class Animal{
    Animal(){
        System.out.println("Animal can eat and sleep:");
    }
}
class Wild_animal extends Animal{
    Wild_animal(){
        System.out.println("Wild_animal's home is forest and they can alive at forest:");
    }
}
class Tiger extends Wild_animal{
    Tiger(){
        System.out.println("Tiger is the king of the forest");
        System.out.println("This is the best example code");
    }
class Bog extends Animal{
    Bog(){
    }
}


