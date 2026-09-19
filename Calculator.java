import java.util.Scanner;
public class Calculator {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true)
        {
            System.out.println("enter the operator : ");
            char op = in.next().trim().charAt(0);
        
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (op == '+')
            {
                ans = num1 + num2;
            }
             if (op == '-')
            {
                ans = num1 - num2;
            }
             if (op == '*')
            {
                ans = num1 * num2;
            }
             if (op == '/')
            { if(num2 != 0)
            {
              ans = num1 / num2;
            }
            else if(num2 == 0){
                System.out.println("Enter number 2 other than 0");
                continue;
            }
            }
            if (op == '%')
            {
              ans = num1 % num2;
        }
        System.out.println("The answer is : " + ans);
    }
        else if(op == 'x' || op == 'X')
        {
            in.close();
            break;
        }
        else {
            System.out.println("Invalid operation!!");
        }
    }

}
}

