import  java.util.Scanner;
public class Test {
    public static void main(String[] args) {
//        int a =10;
//        int b  =20;
//        int ret =  addInt(a,b);
//        System.out.println("ret =" + ret);
//        double c =  10.4;
//        double d  =20.6;
//        double ret2 = addDouble(c,d);
//        System.out.println("ret2 = " + ret2);
//        double a2 = 10.5;
//        double b2 = 20.5;
//        double c3  = 21.0;
//        double ret3 =  addDouble(a2,b2,c3);
//        System.out.println("ret3 =" + ret3);
//    }
//    public  static  int addInt(int x,int y){
//        return  x +y;
//    }
//    public  static  double addDouble(double x, double y){
//        return  x + y;
//
//    }
//    public  static  double addDouble(double x, double y, double z){
//        return  x +y + z;
//    }
//        int n = 5;
//        int ret = factor(n);
//        System.out.println("ret=" + ret);
//    }
//    public  static  int factor(int n){
//        if(n==1){
//            return  1;
//        }
//        return  n * factor(n-1);
//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("请输入一个数:");
//        int num = input.nextInt();
//        int ret = print(num);
//        System.out.println("ret =" + ret);

//       public static  void print(int a){
//           if(a >9){
//             print  (a / 10);
//           }
//            System.out.println(a % 10)
//    public static void print(int a) {
////           if(a >9){
////             print  (a / 10);
////           }
////            System.out.println(a % 10);
//    }
//    public  static  int sum(int num){
//        if(num<10){
//            return  num;
//        }
//        return num % 10 +sum(num /10);
//        public static int fib ( int n){
//            int last1 = 1;
//            int last2 = 2;
//            int cur = 0;
//            for (int i = 3; i <= n; i++) {
//                cur = last1 + last2;
//                last2 = last1;
//                last1 = cur;
//            }
//            return cur;
//        }
//    }
        //    public static int sum(int num) {
//        if (num < 10) {
//            return num;
//        }
//        return num % 10 + sum(num / 10);
//    public static int fib(int n) {
//        int last1 = 1;
//        int last2 = 2;
//        int cur = 0;
//        for (int i = 3; i <= n; i++) {
//            cur = last1 + last2;
//            last2 = last1;
//            last1 = cur;
//        }
//        return cur;
//    }
//        int[] arr = {1,2,3};
//        System.out.println("length :" + arr.length);
////        for(int i =0;i<arr.length;i++){
////            System.out.println(arr[i]);
////        }
//        for(int x : arr){
//            System.out.println(x);
//        }
        int[] arr = {1,2,3};
        printArray(arr);
    }
    public  static  void printArray(int[] a){
        for(int x : a){
            System.out.println(x);
        }
    }
}









