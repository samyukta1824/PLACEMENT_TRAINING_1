class LastOccurrence {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 20, 40};
        int num = 20;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == num) {
                System.out.println("Index: " + i);
                break;
            }
        }
    }
}