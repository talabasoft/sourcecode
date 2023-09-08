package recursion;

public class SayDigits {

    public static String[] map;

    public static void solve(int n) {

        if (n == 0) return;

        int digit = n % 10;

        solve(n / 10);

        System.out.print(map[digit]+" ");

    }

    public static void main(String[] args) {

        map = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        solve(455);

    }
}
