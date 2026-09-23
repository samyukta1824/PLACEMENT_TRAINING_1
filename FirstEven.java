class FirstEven {
    public static void main(String[] args) {
        int[] a = {11, 15, 21, 24, 30};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}