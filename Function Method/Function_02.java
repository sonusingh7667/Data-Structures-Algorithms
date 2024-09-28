package Function_Method;

public class Function_02 {

    public static int multiply(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public static int Factorial(int n){
        int f = 1;

        for(int i = 1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

//    ................... Binomial... Coefficient.....................

    public static int binomialCoefficient(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);

        int binomialCoefficient = fact_n / (fact_r * fact_nmr);
        return binomialCoefficient;
    }



    public static void main(String [] args){

        int a = 6;
        int b = 6;
        int prod = multiply(a,b);
//        System.out.println("a * b = "+prod);
        prod = multiply(2000, 2);
//        System.out.println("a * b = "+prod);


//        System.out.println(Factorial(8));

        System.out.println(binomialCoefficient(5,2));

    }
}
