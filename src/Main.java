import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if ( i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int count ;
        int[] dublicate = new int[list.length];
        int startIndex = 0;
        Arrays.sort(list);
        System.out.println("Repeat Numbers");

        for(int i = 0; i < list.length; i++){
            count = 0;

            for(int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    count ++;
                }
            }
            if (!isFind(dublicate, list[i])) {
                System.out.println(list[i] + " repeated " + (count + 1)+ " times.");
                dublicate[startIndex++]= list[i];

            }
        }
    }
}