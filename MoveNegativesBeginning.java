class MoveNegativesBeginning {
    public static void main(String[] args) {
        int[] a = {10, -5, 20, -2, 30, -8};

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
                index++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}