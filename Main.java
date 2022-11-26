import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
//       else if (a % 5 != 0 ) System.out.println(a/5 +1);

        //  int N = sc.nextInt(),a= sc.nextInt();if(Math.pow(2,a)==N)System.out.println("YES");
        //  else {System.out.println("NO");}
        System.out.println("Your role:");
        String role = sc.nextLine();
        System.out.println("Your pass:");
        String  pass = sc.nextLine();
        if (role.equals("Admin") && pass.equals("121345")) {
            System.out.println("Hello,Dear Admin.Information desk");
        } else {
            System.out.println("what`s your name?");
            String name = sc.nextLine();
            System.out.println("Welcome to BD," + name);
        }

    }}