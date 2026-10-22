import java.util.Scanner;

public class CheckEvenOdd {

    int num;

    CheckEvenOdd(int num) {
        this.num = num;
    }
    
    String checkEvenodd() {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    @Override
    public String toString() {
        return String.format("%d is %s", num, checkEvenodd());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        CheckEvenOdd obj = new CheckEvenOdd(num);
        System.out.println(obj);
        sc.close();
    }
}
