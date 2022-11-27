public class FuncClass {
    public void DoTheJob(){
        // Задачки с практики
        // 1) Напечатать числа в виде таблицы
        // 5 5 5 5 5 5
        // 5 5 5 5 5 5
        // 5 5 5 5 5 5
        // 5 5 5 5 5 5
        Square(6);

        // 2) Напечатать числа в виде таблицы
        // 5
        // 5 5
        // 5 5 5
        // 5 5 5 5
        // 5 5 5 5 5
        Triangle(6);

        // 3) Напечатать числа в виде таблицы
        // Напишите метод, который бы возвращал в консоль:●true, если число больше 5●и false, если число меньше
        IfFiveNotFive(10);

        // 4) Напечатать полную таблицу сложения в виде:
        // 1 + 1 = 2     1 + 2 = 3  ... 1 + 9 = 10
        // 2 + 1 = 3     2 + 2 = 4  ... 2 + 9 = 11
        // ...
        // 9 + 1 = 10   9 + 2 = 11  ... 9 + 9 = 18
        printSummTable();

        // 6)
        // Даны стороны двух треугольников. Найти сумму их периметров и сумму ихплощадей.
        // (Определить процедуру для расчета периметра и площадитреугольника по его сторонам.)
        sidesOfTriangles(10,12,13,14);

        // 7)
        DrawTheDotLine(10);

        // 8)
        PrintNumbers();

        /*iPrint(5);
        iPrint(Max(4,5));

        int a = 4;
        int b = 5;
        System.out.printf("a= %d, b= %d, \n",a,b);
        Exchange(a,b);
        int c = a;
        a = b;
        b = c;
        System.out.printf("a= %d, b= %d, \n",a,b);*/
    }

    public static void Triangle(int num){
         for(int i = 1; i < num; i++){
             for(int k = 0; k < i; k++){
                 System.out.print("5 ");
             }
             System.out.println();
         }
    }

    public static void Square(int num){
        for(int i = 1; i < num; i++){
            for(int k = 0; k < 6; k++){
                System.out.print("5 ");
            }
            System.out.println();
        }
    }

    public static void IfFiveNotFive(int num){
         if(num > 5)
             System.out.println("true");
         else
             System.out.println("false");
    }

    public static void printSummTable(){
        for(int i = 1; i <= 9; i++){
            for(int k = 1; k <= 9; k++){
                System.out.print(i + "+" + k + "=" + (i+k) + " ");
            }
            System.out.println();
        }
    }

    public static void PrintNumbers(){
        for(int i = 1; i <= 10; i++){
            for(int k = 1; k <= 10; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void DrawTheDotLine(int count){
        for(int i = 1; i <= count; i++){
            System.out.print("*");
        }
    }

    public static void sidesOfTriangles(int kat1, int kat2, int kat1_1, int kat2_2){
        double sqrt1 = (kat1*kat2)/2;
        double sqrt2 = (kat1_1*kat2_2)/2;
        double per1 = kat1+kat2+Math.sqrt(kat1*kat2 + kat2*kat2);
        double per2 = kat1_1+kat2_2+Math.sqrt(kat1_1*kat2_2 + kat2*kat2_2);

        System.out.println("Площадь треугольника1: " + sqrt1);
        System.out.println("Периметр1: " + per1);
        System.out.println("Площадь треугольника2: " + sqrt2);
        System.out.println("Периметр2: " + per2);
        double summPer = per1 + per2;
        System.out.println("Сумма периметров: " + summPer);
        double summSqrt = sqrt1 + sqrt2;
        System.out.println("Сумма площадей: " + summPer);
    }

    public static void iPrint(int i){
        System.out.println(i);
    }

    public static int Max(int a,int b){
        if(a > b)
            return a;
        else
            return b;
    }

    public static void Exchange(int a,int b){
        int c = a;
        a = b;
        b = c;
    }
}
