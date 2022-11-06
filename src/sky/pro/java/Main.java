package sky.pro.java;

public class Main {

  public static void main(String[] args) {
    /*- Задача:
    Необходимо реализовать следующий метод:
    1. Получаем на входе массив чисел.
    2. Все четные числа увеличиваем на единицу.
    3. Возвращаем кусок списка с 3-го по 7-й элемент.*/
    int[] array = {2, 5, 6, 78, 41, 23, 69, 88, 74};
    sum(array);
  }

  public static int[] sum(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        array[i] += 1;
      }
      if (i >= 2 && i <= 7) {
        System.out.print(array[i] + " ");
      }
    }
    return array;
  }
}
