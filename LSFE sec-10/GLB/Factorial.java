class Factorial {
    static int fact(int n) {
        if (n <= 1)
            return 1;          // Base condition

        return n * fact(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}