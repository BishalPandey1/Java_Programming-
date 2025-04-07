class SimpleIntrest{
    public static void main (String[] args){
        SimpleIntrestt obj = new SimpleIntrestt();
        obj.simple(700, 1 ,9);
        
    }
}
class SimpleIntrestt{
    void simple(int p, int t, int r)
    {
    int simpleintrest= (p*t*r)/100;
    System.out.print("The value of simple intrest is:"+ simpleintrest );
    }
}
