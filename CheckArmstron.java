import java.util.Scanner;

public class CheckArmstron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int len = (int) Math.log10(num)+1;
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum += Math.pow(digit,len);
            num = num/10;
        }
        if(sum==temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        sc.close();



        



    }
    
}
