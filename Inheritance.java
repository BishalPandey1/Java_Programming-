
class  Animal{
    void animal(int a, int b){
       System.out.println("This is the list of the animals");
       int c= a + b;
       System.out.println("There are some animals there list are:"+c);
    }
}
class Dog extends Animal{
    void dog(){
        System.out.println("The dog social animal");
    }
}
class Cat extends Animal{
    void cat(){
        System.out.println("The cat sound is meau");
    }
}
class Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.dog();
        obj.animal(2,3);
        Cat objj = new Cat();
        objj.cat();
    }
}





