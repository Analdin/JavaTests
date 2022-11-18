public class Practice2 {
    public void test(){
        programCounter days = new programCounter();
        days.DisplayInfo();
    }
}

// Задача по расчету чисел - общая цель
// Модуль 1 - Расчет кол-ва недель и месяцев
// Расчет двухзначных чисел

class programCounter {
    public int days = 234;
    public int weeks = 7;
    public int monthes = 30;

    void DisplayInfo(){
        weeks = days / weeks;
        monthes = days / monthes;
        System.out.printf("\n Результат: \n Weeks: %d\n, Month: %d\n, Days: %d\n", weeks,monthes,monthes);
    }
}
