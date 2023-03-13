public class TestFirst {
    public static void main(String[] args) {
        int[] sum = {2, 7, 11, 19, 20, 25};
        int index = -1;
        int index2 = -1;
        int target = 9;
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                if (sum[i] + sum[j] == target) {
                    index = i;
                    index2 = j;
                    System.out.println("index:" + index);
                    System.out.println("index2:" + index2);
                }
            }
        }
    }
}

