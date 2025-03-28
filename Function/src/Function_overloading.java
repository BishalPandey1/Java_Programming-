public class Function_overloading {
    public static void main (String[]args){
        School obj = new School();
        obj.school( 12, 22);
        obj.school(23.22, 23.33);

    }
}
class School{
    void school(int a, int b){
        int c= a + b;
        System.out.println("This is the new value of c is:"+c);
    }
    void school(double z, double y){
        double x = z + y;
        System.out.println("This is the addition value of z: "+x);
    }
}