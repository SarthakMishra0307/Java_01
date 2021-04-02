import java.util.Scanner;
public class TstFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i<3; i++ ){
            String s1 = sc.next();
            int integer = sc.nextInt();
            System.out.printf("%s %d",s1,integer);
        }
        System.out.println("================================");
}
}
