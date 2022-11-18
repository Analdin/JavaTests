import java.util.Scanner;

public class Logic_operations {

    public int radius = 4;
    public double temp = 36.6;
    public int number;
    public int firstNumber;
    public int secondNumber;
    public int boxerW;
    public int nowDay;
    public void RoundCalc(){
        double result = 2 * 3.14 * 4;
        System.out.println("Длина окружности - " + result);
    }
    public void FarenheitCalc(){
        double result = temp * 1.8 + 32;
        System.out.printf("t по Фаренгейту %.2f",result);
    }
    public void KelvinCalc(){
        double result = temp + 273.15;
        System.out.printf("\nt по Кельвину %.2f",result);
    }
    public void ThreeNumber(){
        System.out.println("\nВведите трехзначное число: ");
        number = new Scanner(System.in).nextInt();

        int summ = 0;
        System.out.println("Единицы: " + number % 10);
        System.out.println("Десятки: " + number / 10 % 10);

        while(number > 0){
            summ += number % 10;
            number /= 10;
        }

        System.out.println("Сумма: " + summ);
    }
    public void LogicOperations(){
        System.out.println("\nВведите целое число: ");
        number = new Scanner(System.in).nextInt();
        if(number % 2 == 0){
            System.out.println("Четное");
        }else if(number % 10 == 7){
            System.out.println("Заканчивается на 7");
        }
        else {
            System.out.println("Не четное");
        }
    }
    public void LowerTheDigits(){
        double result;
        System.out.println("\nВведите первое число: ");
        firstNumber = new Scanner(System.in).nextInt();
        System.out.println("\nВведите второе число: ");
        secondNumber = new Scanner(System.in).nextInt();

        if(Math.abs(firstNumber) > secondNumber){
            result = firstNumber / 2;
            System.out.println("\nПервое число уменьшено в два раза: " + result);
        }else{
            System.out.println("\nПервое число без измнений: " + firstNumber);
        }
    }
    public void BoxerWeight(){
        System.out.println("\nВведите вес боксера: ");
        boxerW = new Scanner(System.in).nextInt();

        if(boxerW >= 60 & boxerW <= 75 || boxerW <= 60){
            System.out.println("\nБоксер в легком весе 60-75кг");
        }else if(boxerW >= 75 & boxerW <= 91){
            System.out.println("\nБоксер в среднем весе 75-91кг");
        }else if(boxerW >= 91 & boxerW <= 100){
            System.out.println("\nБоксер в тяжелом весе 91кг");
        }else{
            System.out.println("\nБоксер в супертяжелом весе > 100кг");
        }
    }
    public void DaysOfTheWeek(){
        System.out.println("\nВведите номер дня недели: ");
        nowDay = new Scanner(System.in).nextInt();

        switch (nowDay){
            case 1:
                System.out.println("\nПонедельник");
                break;
            case 2:
                System.out.println("\nВторник");
                break;
            case 3:
                System.out.println("\nСреда");
                break;
            case 4:
                System.out.println("\nЧетверг");
                break;
            case 5:
                System.out.println("\nПятница");
                break;
            case 6:
                System.out.println("\nСуббота");
                break;
            case 7:
                System.out.println("\nВоскрсенье");
                break;
            default:
                System.out.println("\nВведен неверный номер дня недели");
                break;
        }
    }
}
