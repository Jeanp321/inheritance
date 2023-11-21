 class continuee1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration when i = 3");
                continue;
            }
            System.out.println("Current value of i: " + i);
        }
    }
}
