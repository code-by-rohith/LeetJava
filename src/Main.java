class Demo {
    public int maxPower(String s) {
        int maxPower = 1;
        int currentPower = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentPower++;
            } else {
                maxPower = Math.max(maxPower, currentPower);
                currentPower = 1;
            }
        }

        return Math.max(maxPower, currentPower);
    }
}

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();

        System.out.println(demo.maxPower("leetcode"));
        System.out.println(demo.maxPower("abbcccddddeeeeedcba"));
    }
}
