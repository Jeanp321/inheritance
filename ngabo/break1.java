 class break1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.out.println("Breaking the loop at i = 5");
                break;
            }
        }
    }
}
