
/**
 *
 * @author Asim
 */
public class BubbleSort {
    
   
    public static void main(String[] args) {

        int[]array={12,98,45,75,13,87,102,40,19,478};
        System.out.println("Unsorted array elements!");
        printArray(array);
        Sort(array);
        System.out.println("Sorted array elements!");
        printArray(array);
    }
    
    static void Sort(int[]array)
    {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int temp;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    //Method for printing an array elements//
    static void printArray(int[]array){
        for(int element:array)
        {
            System.out.println(element);
        }
    }
}
