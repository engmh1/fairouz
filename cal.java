import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("أدخل الرقم الأول:");
        double num1 = scanner.nextDouble();
        
        System.out.println("أدخل الرقم الثاني:");
        double num2 = scanner.nextDouble();
        
        System.out.println("اختر العملية (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        
        double result;
        
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("لا يمكن القسمة على صفر!");
                    return;
                }
                break;
            default:
                System.out.println("عملية غير صالحة");
                return;
        }
        
        System.out.printf("النتيجة: %.2f%n", result);
    }
}
