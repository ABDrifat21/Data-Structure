public class Insert_in_SortedMatrix {

    public static void main(String[] args) {
        int [] array = {1,2,3,5,6,7};
         int value = 4,postion = 0 ;
        for (int i = array.length-1;i>=0;i--){

            if(array[i]<=value){
               postion = i;
               break;
            }
        }
        for (int j = array.length-1;j>postion;j--){

            array[j]=array[j-1];
        }
        array[postion+1] = value;
        for (int i:array)
            System.out.println(i);

    }
}
