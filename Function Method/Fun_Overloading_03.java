package Function_Method;

public class Fun_Overloading_03 {

//    public static int sum(int a, int b){
//        return a + b;
//    }
//
//    public static float sum(int a, int b, int c){
//        return a +b +c;
//    }
//    ..............................................................

    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a * b;
    }


    public static void main(String [] args){

//        System.out.println(sum(22,33));
//        System.out.println(sum(22,22,22));

        System.out.println(sum(22,33));
        System.out.println(sum(22.23f,33.89f));
        System.out.println(sum(2234567,339876));


    }
}
