import org.w3c.dom.ls.LSOutput;

public class Practice1 {

    public static void tests() {
        // Примеры типизации (тип_данных название_переменной = значение)
        int num = 5;

        // Статическая типизация (можно сложить только целочисленные значения, например)
        short digit = 1;
        digit = 3;
        digit = 'c';
        //digit = 15658;

        // Переменная не меняет свое значение - константа
        final String string = "Hello World!";
        //string = "Hi";

        // Виды типов данных
        byte byteValue = 1;
        short shortValue = 20;
        int intValue = 1000;
        long lngValue = 105648648468L;

        char charValue = 'r';
        String stringValue = "пример текста";
        boolean boolValue = true;
        double doubValue = 12.8;
        float flValue = 15.8975F;

        // Арифметические операции
        int sum = 10 + 15;
        int result = 20 - 5;
        int proiz = 3 * 5;

        int del = 20 / 4;
        int del2 = 21 / 4;
        int del3 = 21 % 4; // Присваивание остатка от деления
        int resultPr = 2 * (3 + 5);

        int increment = 1;

        for(int i = 0;i < 3;i++){
            increment++;
            System.out.println(increment);
        }

        ++increment;

        increment++; // increment = increment + 1;

        int sum2 = 2 - increment++; // sum2 = 2 - increment; increment = increment + 1;
        int sum3 = 2 - ++increment; // increment = increment + 1; sum2 = 2 - increment;

        // Вывод
        System.out.println(sum2);
        System.out.println(sum3);

        // Вывод информации
        System.out.println("Its a string"); // вывод с новой строки, только ln перевод на след строку
        System.out.printf(
                "Деление целого: - %d, Делением с остатком - %d\nПрисваивание остатка от деления: %d, произведение - %d",
                del,del2,del3,resultPr
        ); // Вывести строку в нужном формате. Подставлет переменные в исходный шаблона
        // Одно место = значение. %d - целочисленные, %f - с плав запятой, %c - char, %s - string
        System.out.print("Результат умножения " + resultPr);

        char c = 'c';
        System.out.println("char - " + c);

        double result4 = 5 / 4.0;
        System.out.println("double - " + result4);

        int result5 = (int) 56.7; // Желаемый тип данных
        System.out.println("result5 - " + result5);


    }
}
