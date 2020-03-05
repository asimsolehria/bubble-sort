/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;
/**
 *
 * @author Asim
 */
public class BubbleSort {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
    static void printArray(int[]array){
        for(int element:array)
        {
            System.out.println(element);
        }
    }
}
