public class Palindrome {
    static boolean isPalindrome(String word){
        int length = word.length();
        // с обоих концов в середину
        for(int i = 0; i < (length/2); i++){
            if (word.charAt(i) != word.charAt(length - i - 1)){
                // если найдено не соотетствие слово не палидром
                return false;
            }
        } return true;
    }
}
