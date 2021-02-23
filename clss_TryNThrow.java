public class clss_TryNThrow {
    public static void main(String[] args) {

        try {
        int num1 = 2/0;
        System.out.println(num1);}
        catch (ArithmeticException ae){
        System.out.println(ae);
        }
        }
    
}
