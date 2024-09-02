public class Main {

    public void printMax(int[] arr, int n, int k){
        int j, max;
        for(int i = 0; i <= n - k; i++){
            max = arr[i];
            for( j = 1; j < k; j++){
                if(max < arr[i + j] ){
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 1, 2, 3, 2, 1, 1, 5};
        int k = 3;
        int n = arr.length;

        Main maxValue = new Main();
        maxValue.printMax(arr, n, k);
    }
}