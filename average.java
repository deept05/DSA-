import java.util.*;
public class average {
    public static void AverageFunction(int a, int b, int c){
        int average = (a + b + c )/2;
        System.out.println(average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        AverageFunction(a,b,c);

    }
}
