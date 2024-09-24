package PRACTICE_PRACTICE_PRACTICE;

public class Function {
    public static void isEven(int n){
//        int a = 3;
//        for(int i=0; i<=n; i++){
//            if(n % 2 ==0){
//                System.out.println("True");
//            }
//            else{
//                System.out.println("False");
//            }
//        }
    }
//    public static int factorial(int n){
//        int f = 1;
//        for(int i=1; i<=n; i++){
//            f = f*i;
//        }
//        return f;
//    }
//
//    public static int binCoeff(int n, int r){
//        int fact_n = factorial(n);
//        int fact_r = factorial(r);
//        int fact_nmr = factorial(n-r);
//        int binCoeff = fact_n / (fact_r * fact_nmr);
//        return binCoeff;
//    }


//    public static int multiply(int num1, int num2){
//        int prod = num1 * num2;
//        return prod;
//    }


//    public static int sum(int a, int b){
//        int add = a + b;
//        return add;
//    }
//
//    public static float sum(float a, float b,float c){
//        float add1 = a + b;
//        return add1;
//    }
//
//    public static String sum(String a, String b){
//        String add2 = a + b;
//        return add2;
//    }

//    public static int Average(int a, int b, int c){
//        int avg = (a+b+c)/3;
//        return avg;
//    }

//    public static boolean isEven1(int n){
//        if(n % 2 == 0){
//            return true;
//        }
//        else {
//           return false;
//        }
//    }

//    Palindrome.................palindrome...........

//    public static int reverseNumber(int n){
//        int reverseNumber = 0;
//
//        while(n>0){
//            int lastDigit = n % 10;
//            n = n/10;
//            reverseNumber = reverseNumber*10 + lastDigit;
//        }
//        return reverseNumber;
//    }
//
//    public static boolean checkPalindrome(int n){
//        int reverseNumber1 = reverseNumber(n);
//        if(reverseNumber1 == n){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }


//.............................................................................


    public static int sumOfDigit(int num){
        int sum = 0;

        while(num>0){
            int lastDigit = num %10;
            num =  num/10;
            sum = sum + lastDigit;

        }
        return sum;
    }





    public static void main(String[] args){

//        isEven(22);

//        System.out.println(factorial(4));
//        System.out.println(binCoeff(5,2));

//        int a=  4;
//        int b=  4;
//        System.out.println(multiply(4,5));


//        System.out.println(sum(2,7));
//        System.out.println(sum(25.33f,33.33f,88.45f));
//        System.out.println(sum("sonu","_singh"));


//        System.out.println(Average(4,6,8));

//        System.out.println(isEven1(287545421));

//        System.out.println(reverseNumber(321));
//        System.out.println(checkPalindrome(321));


        System.out.println(sumOfDigit(123456789));


    }
}
