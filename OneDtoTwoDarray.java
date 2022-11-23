public class OneDtoTwoDarray {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{4676,5,6},{7,8,9}};

         int [] ar = new int[9];
         int k = 0;
        for (int i =0;i<3;i++){
            for (int j = 0;j< 3;j++){
                ar[k] =array[i][j];
                k++;
            }
        }

       for (int i:ar)
           System.out.print(i +" ");
    }
}
