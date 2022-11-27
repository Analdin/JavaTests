public class CyclesTests {
    public void test(){
        runEverNumber(10,25);
        printNumbersWithDot();
    }

    public static void runEverNumber(int num, int count){
        for(count = 1; count < num; count++){
            System.out.println("num: " + num + "," + "count: " + count);
        }
    }

    public static void printNumbersWithDot(){
        for(int i = 5; i > 0; i--) {

            System.out.println(i);

        }
    }
}
