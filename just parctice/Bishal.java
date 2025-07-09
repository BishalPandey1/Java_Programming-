public class Bishal {
    public static void main(String[] args) {
        System.out.println("There is some things here bishal ");
        int a = 2;
        int b = 3;
        int c;
        c = a + b;
        System.out.println("THe value of the c is " + c);
        if (a == b) {
            System.out.println("The value of a and be is equal with each other");
        } else {
            System.out.println("The value of a and be is not equal with each other");

        }
        Bishal b1 = new Bishal();
        b1.Function_over_loading(3);
        b1.Function_over_loading();

        Ramu ramu1 = b1.new Ramu();
        ramu1.ramu1(5, 15);
        Hari hari1 = b1.new Hari();
        hari1.hari1(10, 20);

    }

    Bishal() {
        int d = 20;
        System.out.println("This is the value of the d" + d);

    }

    public void Function_over_loading(int a) {
        System.out.println("This first overloading function" + a);
    }

    public void Function_over_loading() {
        System.out.println("The is second overloading function");

    }

    public class Ramu {
        int m;
        int n;

        void ramu1(int m, int n) {

            int o = m + n;
            System.out.println("The value of o is " + o);

        }
    }

    public class Hari {
        int g;
        int h;
        int i = g + h;

        void hari1(int g, int h) {
            if (g > 0 && h > 0) {
                System.out.println("There is some thing i want:");
            } else {
                System.out.println("The value is negative ");
            }

        }
    }

}


