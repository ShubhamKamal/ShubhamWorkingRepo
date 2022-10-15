import com.oracle.webservices.internal.api.databinding.DatabindingMode;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      int a = 10;
      int b = 20;
      int c;
       c= getSum(a,b);

       System.out.println(c);


    }

    private static int getSum(int a, int b){
        int c;
        c = a+b;
        return c;
    }
}


class Student{


}