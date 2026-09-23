class CountGreater {
    public static void main(String[] args) {
        int[] a = {10, 25, 30, 15, 40};
        int num = 20;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > num) {
                count++;
            }
        }

        System.out.println(count);
    }
}