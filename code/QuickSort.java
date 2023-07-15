import java.util.Scanner;
import java.util.ArrayList;
class QuickSort{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            numbers.add(scan.nextInt());
        }
        scan.close();
        
        QuickSort.sort(numbers);
        for(int i : numbers){
            System.out.println(i);
        }
    }

    public static void sort(ArrayList<Integer> numbers) {
        QuickSort.sort(numbers, 0, numbers.size() - 1);
    }

    public static void sort(ArrayList<Integer> numbers, int lo, int hi){
        if((lo >= hi) || (lo < 0)) { return; }

        int pivot = QuickSort.partition(numbers, lo, hi);

        QuickSort.sort(numbers, lo, pivot-1);
        QuickSort.sort(numbers, pivot+1, hi);
    }

    public static int partition(ArrayList<Integer> numbers, int lo, int hi) {
        int pivot = numbers.get(hi);
        int temp_pivot = lo - 1;
        for(int j = lo; j < hi; j++){
            if(numbers.get(j) <= pivot){
                temp_pivot += 1;
                //swap temp_pivot and j
                int temp = numbers.get(temp_pivot);
                numbers.set(temp_pivot, numbers.get(j));
                numbers.set(j, temp);
            }
        }
        temp_pivot += 1;
        // swap temp_pivot and hi
        int temp = numbers.get(temp_pivot);
        numbers.set(temp_pivot, numbers.get(hi));
        numbers.set(hi, temp);
        return temp_pivot;
    }
}