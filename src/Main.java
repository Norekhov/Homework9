public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача № 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача № 2");
        int[] money = generateRandomArray();
        int maxMoney = money[0];
        int minMoney = money[0];
        for (int i : money) {
            if (i > maxMoney) {
                maxMoney = i;
            }
            if (i < minMoney) {
                minMoney = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minMoney + " рублей. Максимальная сумма трат за день составила " + maxMoney + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача № 3");
        int[] money = generateRandomArray();
        int sum = 0;
        for (int j : money) {
            sum += j;
        }
        int days = 30;
        float averageSum = (float) sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей.");
    }

    public static void task4() {
        System.out.println("Задача № 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
    }
}