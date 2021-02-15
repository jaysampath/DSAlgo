class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; ++i) {

            int amount = 0;

            for (char c : chars) {

                if (amount > 1) {
                    break;
                }

                if (c == chars[i]) {
                    ++amount;
                }
            }

            if (amount == 1) {
                return i;
            }
        }

        return -1;
        
    }
}
