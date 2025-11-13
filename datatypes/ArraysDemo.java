import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        int[] numbers2 = {5, 2, 8, 1, 9};
        int[] numbers3 = {1, 2, 3, 4, 5};
        
        
        System.out.println("toString()");
        System.out.println("numbers: " + Arrays.toString(numbers));
        
        System.out.println("equals()");
        System.out.println("numbers equals numbers2: " + Arrays.equals(numbers, numbers2));
        System.out.println("numbers equals numbers3: " + Arrays.equals(numbers, numbers3));
        
        System.out.println("sort()");
        System.out.println("Before sort: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sort: " + Arrays.toString(numbers));
        
        System.out.println("binarySearch()");
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);
        int indexNotFound = Arrays.binarySearch(numbers, 10);
        System.out.println("Index of 10: " + indexNotFound);
        
        System.out.println("compare()");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 4};
        int[] arr4 = {1, 2};
        
        System.out.println("compare(arr1, arr2): " + Arrays.compare(arr1, arr2));
        System.out.println("compare(arr1, arr3): " + Arrays.compare(arr1, arr3));
        System.out.println("compare(arr1, arr4): " + Arrays.compare(arr1, arr4));
        System.out.println("compare(arr4, arr1): " + Arrays.compare(arr4, arr1));
        
        String[] words = {"banana", "apple", "cherry"};
        System.out.println("String array: " + Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("Sorted words: " + Arrays.toString(words));
        
        char[] chars = {'z', 'a', 'm', 'b'};
        System.out.println("Char array: " + Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println("Sorted chars: " + Arrays.toString(chars));
    }
}
