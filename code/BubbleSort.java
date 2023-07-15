import java.util.Scanner;
import java.util.ArrayList;
class BubbleSort{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            numbers.add(scan.nextInt());
        }
        scan.close();
        
        BubbleSort.sort(numbers);
        for(int i : numbers){
            System.out.println(i);
        }
    }
    public static void sort(ArrayList<Integer> numbers){
        for(int i = numbers.size() - 1; i > 0; i--){
            boolean swapped = false;
            for(int j = 0; j < i; j++){
                if(numbers.get(j) > numbers.get(j + 1)){
                    //swap
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j+1));
                    numbers.set(j+1, temp);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}