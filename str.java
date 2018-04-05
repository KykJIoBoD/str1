import java.util.Scanner;
//калькулятор, дробные числа, 4 операции
/**
 * @author Max Dobychin
 * Действующие типы : int и Char*/
public class str {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое число ");
        float a = s.nextFloat();
        System.out.println("Введите второе число ");

        float b = s.nextFloat(); //сканером получаем числа
        char op;
        System.out.print("Выберите действие: \n" +
                "1. + (сложение)\n" +
                "2. - (вычетание)\n" +
                "3. * (умножение)\n" +
                "4. / (деление)\n");
        op = s.next().charAt(0);//смотрим, какую операцию выберут
        System.out.print("Результат: "+a+ " "+op+ " "+b+ " = ");
        if (op == '+') {System.out.printf("%.4f",a + b);}
        if (op == '-') {System.out.printf("%.4f",a - b);}
        if (op == '*') {System.out.printf("%.4f",a * b);}
        if (op == '/') {System.out.printf("%.4f",a / b);}//в зависимости от операции выводим соответствующий результат
        else System.exit(0);
        s.close();


    }
}
