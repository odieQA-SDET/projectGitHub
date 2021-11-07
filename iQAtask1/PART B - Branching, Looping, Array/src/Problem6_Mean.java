public class Problem6_Mean {
    private static float Mean(float[] s) {
        float jumlahdata = 0;
        for (float v : s) {
            jumlahdata += v;
        }
        return jumlahdata /s.length;
    }
    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
    }
}
