public class Main {
    public static void main(String[] args) {
        // 1. Вывод чисел от 1 до 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // 2. Заполнение массива числами от 0 до 9
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {  // Исправлено: i < arr.length
            arr[i] = i;
        }

        // 3. Вычисление суммы элементов массива
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // 4. Вывод суммы
        System.out.println("\nSum: " + sum);  // Правильный вывод суммы
    }
}