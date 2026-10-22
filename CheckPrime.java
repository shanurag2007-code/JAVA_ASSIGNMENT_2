import java.util.Scanner;
public class CheckPrime{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num==1){
        System.out.println("1 is not a prime");
        return;
    }
    for(int i=2; i<=Math.sqrt(num); i++){
        if(num%i==0){
            System.out.println("The given num is not a prime");
            return;
        }
    }
    System.out.println("The given num is a prime");
    
 }   
}