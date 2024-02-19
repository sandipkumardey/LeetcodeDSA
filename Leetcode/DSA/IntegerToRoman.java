class Solution {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        int index = 0;

        while (num > 0) {
            while (num >= values[index]) {
                result.append(symbols[index]);
                num -= values[index];
            }
            index++;
        }

        return result.toString();
    }
}
