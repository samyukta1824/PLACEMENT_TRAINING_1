class LastEven {
    public static void main(String[] args) {
        int[] a = {10, 15, 22, 31, 40};

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}