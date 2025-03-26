
class Multi_level_Inheritance_with_Constructor {
    public static void main(String[] args) {
        Me obje = new Me();
    }
}

class Grandpa{
    Grandpa(){
        System.out.println("MY grandpa love studing book.");
    }
}
class Father extends Grandpa{
    Father(){
        System.out.println("My father loves doing programing.");
    }
}
class Me extends Father{
    Me(){
        System.out.println("I love doing programming and reading books.");
    }
}
