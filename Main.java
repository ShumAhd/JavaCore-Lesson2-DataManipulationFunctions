import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums1 = {2, 1, 2, 3, 4};
    int[] nums2 = {2, 2, 0, 0};
    int[] nums3 = {1, 3, 5};

    System.out.println("Количество чётных элементов");
    System.out.print(Arrays.toString(nums1) + "=");
    System.out.println(countEvens(nums1));
    System.out.print(Arrays.toString(nums2) + "=");
    System.out.println(countEvens(nums2));
    System.out.print(Arrays.toString(nums3) + "=");
    System.out.println(countEvens(nums3));

    System.out.println();

    System.out.println("Разница между мин. и макс.");
    System.out.print(Arrays.toString(nums1) + "=");
    System.out.println(findDifference(nums1));
    System.out.print(Arrays.toString(nums2) + "=");
    System.out.println(findDifference(nums2));
    System.out.print(Arrays.toString(nums3) + "=");
    System.out.println(findDifference(nums3));

    System.out.println();

    System.out.println("Имеются ли два соседних элемента, с нулевым значением");
    System.out.print(Arrays.toString(nums1) + "=");
    System.out.println(hasZeroNeighbors(nums1));
    System.out.print(Arrays.toString(nums2) + "=");
    System.out.println(hasZeroNeighbors(nums2));
    System.out.print(Arrays.toString(nums3) + "=");
    System.out.println(hasZeroNeighbors(nums3));
  }

  /**
   * Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) →
   * 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
   *
   * @param nums Принимает массив
   * @return возвращает количество чётных элементов массива.
   */
  public static int countEvens(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if (num % 2 == 0) {
        count++;
      }
    }
    return count;

  }

  /**
   * Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами
   * переданного не пустого массива.
   *
   * @param nums Принимает массив
   * @return Возвращаем разницу между максимальным и минимальным элементами
   */
  public static int findDifference(int[] nums) {
    int max = nums[0];  // Предполагаем, что первый элемент - максимальный
    int min = nums[0];  // Предполагаем, что первый элемент - минимальный

    // Начинаем перебор массива со второго элемента
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];  // Обновляем максимальный элемент
      }
      if (nums[i] < min) {
        min = nums[i];  // Обновляем минимальный элемент
      }
    }

    return max - min;  // Возвращаем разницу между максимальным и минимальным элементами
  }

  /**
   * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с
   * нулевым значением.
   *
   * @param nums Принимает массив
   * @return Возвращает true или false
   */
  public static boolean hasZeroNeighbors(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 0 && nums[i + 1] == 0) {
        return true;  // Если найдены два соседних элемента со значением 0, возвращаем true
      }
    }
    return false;  // Если такие элементы не найдены, возвращаем false
  }


}
