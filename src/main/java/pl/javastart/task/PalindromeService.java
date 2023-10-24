package pl.javastart.task;

public class PalindromeService {
    public boolean isPalindrome(int[] array) {

        if (array == null || array.length == 0) {
            return false;
        }
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
