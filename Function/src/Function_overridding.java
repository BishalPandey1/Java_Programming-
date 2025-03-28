public class Function_overridding {
    public static void main (String[]args){
        Book obj1 = new Book();
        Book obj = new Book(3.3,3.3);
    }
}
class Book{
    Book(){
        int a= 10;
        int b= 20;
        int c= a+b;
        System.out.println("The value of c is:"+c);

    }
    Book(double x, double y) {
        double z= x + y;
        System.out.println("This one is the value of z is:"+z);
    }
}