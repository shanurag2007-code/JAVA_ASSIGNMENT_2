import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        //int len = (int)Math.log10(num)+1;
        //System.out.println("Number of digits : " + len);

        int temp = 0;
        while(num>0){
            temp++;
            num=num/10;
        }
        System.out.println("Number of digits : " + temp);
        sc.close();
    }
}
