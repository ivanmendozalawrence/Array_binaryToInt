public class main {
    public static void main(String[] args) {
        int binaryArr[] = {1, 0, 0, 1};
        int decimal = 0;
        for(int i = 0; i < binaryArr.length; i++){
            decimal += binaryArr[i] * Math.pow(2, binaryArr.length - i - 1);
        }
        System.out.println(decimal);
    }
}