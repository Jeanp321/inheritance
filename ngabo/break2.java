 class break2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            if (i == 7) {
                System.out.println("Breaking the loop at i = 7");
                break;
            }
            i++;
        }
    }
}
