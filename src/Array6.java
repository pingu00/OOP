public class Array6 {
    public static void main (String[] args){
        double[] arr = new double[4];
        for(int i = 0;i < arr.length ; i++){
            arr[i] = i+1 + (double)(i+1)/10;
            System.out.printf("%.1f\n",arr[i]);
        }

    }
}
